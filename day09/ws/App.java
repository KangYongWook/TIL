package ws;

public class App {

	public static void main(String[] args) {

		DB<User, Integer> db = new UserDB();
		User user1 = new User(0, "james", "pwd01");
		User user2 = new User(0, "tom", "pwd02");
		User user3 = new User(1, "a", "pwd03");
		User user4 = new User(2, "tommy", "pwd04");
		db.create(user1);
		db.create(user3);
		db.create(user4);

		db.select();
		db.update(user2);
		System.out.println("update");
		db.select();
		db.delete(2);
		System.out.println("delete");
		db.select();
		System.out.println("id 0");
		System.out.println(db.select(0));
		
		DB<Product, Integer> db2 = new ProductDB();
		Product product1 = new Product(0, "james", 100);
		Product product2 = new Product(0, "tom", 2000);
		Product product3 = new Product(1, "a", 500);
		Product product4 = new Product(2, "tommy", 400);
		db2.create(product1);
		db2.create(product3);
		db2.create(product4);

		db2.select();
		db2.update(product2);
		System.out.println("update");
		db2.select();
		db2.delete(2);
		System.out.println("delete");
		db2.select();
		System.out.println("id 0");
		System.out.println(db2.select(0));
	}
}
