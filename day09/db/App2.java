package db;

public class App2 {

	public static void main(String[] args) {
		Product product = new Product("p01","pants",10000);
		
		Biz biz = new ProductBiz("192.168.111.200");
		
		biz.register(product);
		
		Product dbproduct = null;
		dbproduct = (Product)biz.get("p01");
		System.out.println(dbproduct);
		

	}

}
