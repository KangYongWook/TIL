package com;

import java.sql.Connection;
import java.util.ArrayList;

import frame.Biz;
import frame.Dao;
import vo.Products;
import vo.Factory;
import vo.Join;


public class ProductsBiz extends Biz<Integer, Products> {
	
	Dao<Integer,Products> dao;
	public ProductsBiz() {
		dao = new ProductsDao();
	}
	@Override
	public void register(Products v) throws Exception{
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
	public void remove(Integer k) throws Exception {
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
	public void modify(Products v) throws Exception {
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
	public Products get(Integer k) throws Exception {
		Connection con = null;
		Products u = null;
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
	public ArrayList<Products> get() throws Exception {
		Connection con = null;
		ArrayList<Products> a = null;
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
	
	public ArrayList<Join> getall() throws Exception {
		Connection con = null;
		ArrayList<Join> a = null;
		try {
			con = getCon();
			a = dao.selectAll(con);
		}catch(Exception e) {
			throw e;
		}finally {
		close(con);
		}
		return a;
	}

}
