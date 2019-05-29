package db3;

public class App {
	
	public static void main(String[] args) {
		DB<User,String> db = new UserDB();
		User user = new User("id01","james","pwd01");
		db.insert(user);
		
		DB<Product, Integer> db2 = new ProductDB();
		Product prd = new Product(100, "T", 10000);
		db2.insert(prd);
		
		Product p = db2.select(200);
		System.out.println(p);
	}
	
}
