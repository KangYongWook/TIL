package db2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectAll {

	public static void main(String[] args) {
		// 1. JDBC Driver Loading..
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Loading Error");
		}
		// 2. Connection 1521 db db
		String id = "db";
		String password = "db";
		String url = 
		"jdbc:oracle:thin:@70.12.50.220:1521:xe";
		
		Connection con = null;
		try {
			con = 
			DriverManager.getConnection(url, id, password);
		} catch (SQLException e) {
			System.out.println("Connection Error");		
			e.printStackTrace();
		}
		
		// 3. SQL ����
		String sql = 
		"SELECT * FROM T_PRODUCT";
		PreparedStatement pstmt = null;
		ResultSet rset =  null;
		try {
			pstmt = con.prepareStatement(sql);
			rset = pstmt.executeQuery();

			while(rset.next()) {
				String uid = rset.getString("ID");
				String uname = rset.getString("NAME");
				int uprice = rset.getInt("PRICE");
				Date regdate = rset.getDate("REGDATE");
				System.out.println(uid+" "+uname+" "+uprice+" "+regdate);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 4. close
		try {
			rset.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}







