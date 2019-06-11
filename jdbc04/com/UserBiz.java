package com;

import java.sql.Connection;
import java.util.ArrayList;

import frame.Biz;
import frame.Dao;
import vo.User;


public class UserBiz extends Biz<String, User> {
	
	Dao<String,User> dao;
	public UserBiz() {
		dao = new UserDao();
	}
	@Override
	public void register(User v) throws Exception {
		Connection con = null;
		try {
			con = getCon();
			dao.insert(v, con);
			//dao.insert(v, con); 한번 더 들어가면 unique 에러가 난다. 그래도 앞의 코드는 원상복구 되지 않는다.
			con.commit();
		}catch(Exception e) {
			con.rollback();
			throw e;
		}finally {
		close(con);
		}
	}

	@Override
	public void remove(String k) throws Exception {
		Connection con = null;
		try {
			con = getCon();
			dao.delete(k, con);
			con.commit();
		}catch(Exception e) {
			con.rollback();
			throw e;
		}finally {
		close(con);
		}
	}

	@Override
	public void modify(User v) throws Exception {
		Connection con = null;
		try {
			con = getCon();
			dao.update(v, con);
			con.commit();
		}catch(Exception e) {
			con.rollback();
			throw e;
		}finally {
		close(con);
		}
	}

	@Override
	public User get(String k) throws Exception {
		Connection con = null;
		User u = null;
		try {
			con = getCon();
			u = dao.select(k, con);
		}catch(Exception e) {
			throw e;
		}finally {
		close(con);
		}
		return u;
	}

	@Override
	public ArrayList<User> get() throws Exception {
		Connection con = null;
		ArrayList<User> a = null;
		try {
			con = getCon();
			a = dao.select(con);
		}catch(Exception e) {
			throw e;
		}finally {
		close(con);
		}
		return a;
	}

}
