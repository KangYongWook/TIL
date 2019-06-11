package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

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
		
		// 3. SQL Àü¼Û
		String sql = "INSERT INTO T_USER VALUES (?,?,?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "id20");
			pstmt.setString(2, "pwd20");
			pstmt.setString(3, "¿À¸»¼÷");
			int result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 4. close
		try {
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}







