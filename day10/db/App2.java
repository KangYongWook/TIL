package db;

public class App2 {

	public static void main(String[] args) {
		Biz biz = null;
		Product p = new Product(
				"p01", "pants", 10000);
		biz.register(p);
	}

}
