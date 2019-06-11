package frame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.Join;

public abstract class Dao<K,V>{//data access object
	
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
	public abstract void insert(V v, Connection con) //Biz가 커넥션 준다.
			throws Exception;
	public abstract void delete(K k, Connection con) //id 선택
			throws Exception;
	public abstract void update(V v, Connection con) 
			throws Exception;
	public abstract V select(K k, Connection con) // id 선택
			throws Exception;
	public abstract ArrayList<V> select(Connection con)
			throws Exception;
	public abstract ArrayList<Join> selectAll(Connection con)
			throws Exception;
	
	

}
