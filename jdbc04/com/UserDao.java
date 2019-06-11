package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import frame.Dao;
import frame.Sql;
import vo.User;

public class UserDao extends Dao<String, User> {
	@Override
	public void insert(User v, Connection con) throws Exception {
		PreparedStatement pstmt = null;
		try{
		pstmt = con.prepareStatement(Sql.insertUser);
		pstmt.setString(1,v.getId());
		pstmt.setString(2,v.getName());
		pstmt.setString(3,v.getPwd());
		pstmt.executeUpdate();
		}catch(Exception e) {
			throw e;
		}finally {
		close(pstmt);//close 안 될 수 있으니 주의!
		}//biz에서 transaction 처리하기위해 connection 관리는 누가하냐..
	}

	@Override
	public void delete(String k, Connection con) throws Exception {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(Sql.insertDelete);
			pstmt.setString(1, k);
			int result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			throw e;
		}finally {
			close(pstmt);
			}
	}

	@Override
	public void update(User v, Connection con) throws Exception {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(Sql.insertUpdate);
			pstmt.setString(1, v.getPwd());
			pstmt.setString(2, v.getName());
			pstmt.setString(3, v.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw e;
		} finally {
			close(pstmt);
			}		
	}

	@Override
	public User select(String k, Connection con) throws Exception {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		User u;
		try {
			pstmt = con.prepareStatement(Sql.insertSelect);
			pstmt.setString(1, k);
			rset = pstmt.executeQuery();
			rset.next();
			String uid = rset.getString("ID");
			String upwd = rset.getString("PWD");
			String uname = rset.getString("NAME");
			u = new User(uid,upwd,uname);
		} catch (SQLException e) {
			throw e;
		} finally {
			close(pstmt);
			}
		return u;
		
	}

	@Override
	public ArrayList<User> select(Connection con) throws Exception {
		ArrayList<User> a = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			pstmt = con.prepareStatement(Sql.insertSelectall);
			rset = pstmt.executeQuery();
			while(rset.next()) {
				String uid = rset.getString("ID");
				String upwd = rset.getString("PWD");
				String uname = rset.getString("NAME");
				a.add(new User(uid, upwd, uname));
			} 
		}catch (SQLException e) {
			throw e;
		}finally {
			close(pstmt);
			}
		return a;
	
		}
	}

