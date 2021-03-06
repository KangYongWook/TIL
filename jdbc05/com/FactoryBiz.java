package com;

import java.sql.Connection;
import java.util.ArrayList;

import frame.Biz;
import frame.Dao;
import vo.Factory;
import vo.Join;
import vo.Products;

public class FactoryBiz extends Biz<String, Factory>{	
	Dao<String, Factory> dao;
	public FactoryBiz() {
		dao = new FactoryDao();
	}
	
    @Override
	public void register(Factory v) throws Exception{
		Connection con = null;
		try {
			con = getCon();
			dao.insert(v, con);
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
	public void modify(Factory v) throws Exception {
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
	public Factory get(String k) throws Exception {
		Connection con = null;
		Factory u = null;
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
	public ArrayList<Factory> get() throws Exception {
		Connection con = null;
		ArrayList<Factory> a = null;
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

	@Override
	public ArrayList<Join> getall() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}