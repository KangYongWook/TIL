package frame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.Join;

public abstract class Biz<K,V> {
	
	String id;
	String pwd;
	String url;
	
	public Biz() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Loading Error");
		}
		id = "db";
		pwd = "db";
		url = "jdbc:oracle:thin:@70.12.50.237:1521:xe";
	}
	public Connection getCon() {
		Connection con =null;
		try {
			con =
			DriverManager.getConnection(url, id, pwd);
			con.setAutoCommit(false);//transaction 처리를 수동으로 하겠다.
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public void close(Connection con) {
		if(con!= null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	public void close(PreparedStatement con) {
		if(con!= null) {
			try {
				con.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void close(ResultSet con) {
		if(con!= null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	public abstract void register(V v)
			throws Exception;
	public abstract void remove(K k) //id 선택
			throws Exception;
	public abstract void modify(V v) 
			throws Exception;
	public abstract V get(K k)
			throws Exception;
	public abstract ArrayList<V> get()
			throws Exception;
	public abstract ArrayList<Join> getall()
			throws Exception;
	

}

