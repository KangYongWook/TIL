#  Java와 DB의 연동 

### java -> 프로젝트 오른쪽마우스 클릭 -> 맨밑 properties -> 라이브러리 ->Add External-> oraclexe->app->oracle->product->11.2.0->sever->jdbc->lib->3개 추가 

java에는 oracle 라이브러리가 없기때문에 추가해줌.  

data base는 Oracle를 사용함 

# Delete

```java
package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

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
		
		// 3. SQL 전송
		String sql = 
		"DELETE FROM T_USER WHERE ID=?";
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "id20");
		
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








```

​	

# INSERT

```JAVA
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
		
		// 3. SQL 전송
		String sql = "INSERT INTO T_USER VALUES (?,?,?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "id20");
			pstmt.setString(2, "pwd20");
			pstmt.setString(3, "오말숙");
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








```

# SELECT

```JAVA
package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

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
		"jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		Connection con = null;
		try {
			con = 
			DriverManager.getConnection(url, id, password);
		} catch (SQLException e) {
			System.out.println("Connection Error");		
			e.printStackTrace();
		}
		
		// 3. SQL 전송 & Receive
		String sql = 
		"SELECT * FROM T_USER WHERE ID=?";
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "id01");
			rset = pstmt.executeQuery();
			rset.next();
			String uid = rset.getString("ID");
			String upwd = rset.getString("PWD");
			String uname = rset.getString("NAME");
			System.out.println(uid+" "+upwd+" "+uname);
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








```

# SELECTALL

```JAVA
package db1;

import java.sql.Connection;
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
		
		// 3. SQL 전송
		String sql = 
		"SELECT * FROM T_USER";
		PreparedStatement pstmt = null;
		ResultSet rset =  null;
		try {
			pstmt = con.prepareStatement(sql);
			rset = pstmt.executeQuery();

			while(rset.next()) {
				String uid = rset.getString("ID");
				String upwd = rset.getString("PWD");
				String uname = rset.getString("NAME");
				System.out.println(uid+" "+upwd+" "+uname);
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








```



# UPDATE

```JAVA
package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

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
		
		// 3. SQL 전송
		String sql = 
		"UPDATE T_USER SET PWD=?,NAME=? WHERE ID=?";
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "0000");
			pstmt.setString(2, "오말년");
			pstmt.setString(3, "id01");
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








```

