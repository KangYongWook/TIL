package db2;

public class App {
	
	
	 
	public static void main(String[] args) {
		
		String id = "id01";
		String name = "tom";
		String pwd = "pow02";	
		DB db = new DBUser("192.100.100.1"); //DB¿¡DBUSER°´Ã¼¸¦ ¸¸µë 
		
		User user = new User(id, name , pwd);
		db.insert(user);
		
		User dbuser =null;
		dbuser = (User)db.select("id02");
		System.out.println(dbuser);
		
	}
}
