package db;

public class App {

	public static void main(String[] args) {
		User user = new User("id01", 
				"james", "pwd01");
		Biz biz = new UserBiz("192.168.111.100");
		//biz.register(user);
		//biz.remove("id01");
		
		User dbuser = null;
		dbuser = (User)biz.get("id01");
		System.out.println(dbuser);
	}

}



