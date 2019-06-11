package com;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

import frame.Dao;
import frame.SqlProducts;
import vo.Join;
import vo.Products;

public class ProductsDao extends Dao<Integer, Products> {
	@Override
	public void insert(Products v, Connection con) throws Exception {
		PreparedStatement pstmt = null;
		try{
		pstmt = con.prepareStatement(SqlProducts.insertProduct);
		pstmt.setInt(1,v.getPdno());
		pstmt.setString(2,v.getPdname());
		pstmt.setString(3,v.getPdsubname());
		pstmt.setString(4,v.getFactno());
		pstmt.setDate(5,v.getPddate());
		pstmt.setInt(6,v.getPdcost());
		pstmt.setInt(7,v.getPdprice());
		pstmt.setInt(8,v.getPdamount());
		pstmt.executeUpdate();
		}catch(Exception e) {
			throw e;
		}finally {
		close(pstmt);//close 안 될 수 있으니 주의!
		}
	}

	@Override
	public void delete(Integer k, Connection con) throws Exception {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(SqlProducts.DeleteProduct);
			pstmt.setInt(1, k);
			int result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			throw e;
		}finally {
			close(pstmt);
			}
	}

	@Override
	public void update(Products v, Connection con) throws Exception {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(SqlProducts.UpdateProduct);
			pstmt.setString(1, v.getPdname());
			pstmt.setString(2, v.getPdsubname());
			pstmt.setString(3, v.getFactno());
			pstmt.setDate(4, v.getPddate());
			pstmt.setInt(5, v.getPdcost());
			pstmt.setInt(6, v.getPdprice());
			pstmt.setInt(7, v.getPdamount());
			pstmt.setInt(8, v.getPdno());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw e;
		} finally {
			close(pstmt);
			}		
	}

	@Override
	public Products select(Integer k, Connection con) throws Exception {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Products p;
		try {
			pstmt = con.prepareStatement(SqlProducts.SelectProduct);
			pstmt.setInt(1, k);
			rset = pstmt.executeQuery();
			rset.next();
			int pno = rset.getInt("PDNO");
			String pname = rset.getString("PDNAME");
			String psubname = rset.getString("PDSUBNAME");
			String fno = rset.getString("FACTNO");
			Date pdate = rset.getDate("PDDATE");
			int pcost = rset.getInt("PDCOST");
			int pprice = rset.getInt("PDPRICE");
			int pamount = rset.getInt("PDAMOUNT");
			p = new Products(pno,pname,psubname,fno,pdate,pcost,pprice,pamount);
		} catch (SQLException e) {
			throw e;
		} finally {
			close(pstmt);
			}
		return p;
		
	}

	@Override
	public ArrayList<Products> select(Connection con) throws Exception {
		ArrayList<Products> a = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			pstmt = con.prepareStatement(SqlProducts.SelectAllProduct);
			rset = pstmt.executeQuery();
			while(rset.next()) {
				int pno = rset.getInt("PDNO");
				String pname = rset.getString("PDNAME");
				String psubname = rset.getString("PDSUBNAME");
				String fno = rset.getString("FACTNO");
				Date pdate = rset.getDate("PDDATE");
				int pcost = rset.getInt("PDCOST");
				int pprice = rset.getInt("PDPRICE");
				int pamount = rset.getInt("PDAMOUNT");
				a.add(new Products(pno,pname,psubname,fno,pdate,pcost,pprice,pamount));
			} 
		}catch (SQLException e) {
			throw e;
		}finally {
			close(pstmt);
			}
		return a;
	
		}

	@Override
	public ArrayList<Join> selectAll(Connection con) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Join> b = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			pstmt = con.prepareStatement(SqlProducts.SelectAll);
			rset = pstmt.executeQuery();
			while(rset.next()) {
				String pname = rset.getString("PDNAME");
				String psubname = rset.getString("PDSUBNAME");
				String fname = rset.getString("FACNAME");
				String floc = rset.getString("FACLOC");
				b.add(new Join(pname, psubname,fname,floc));
			}
		}catch (SQLException e) {
			throw e;
		}finally {
			close(pstmt);
			}
		return b;

	}
}
