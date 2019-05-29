package db;

public class ProductDao extends Dao {

	public ProductDao(String ip) {
		super(ip);
	}
	
	@Override
	public void insert(Object obj) {
		connection();
		Product p = (Product)obj;
		System.out.println(p.getId()+" "+
				p.getName()+" "+
				p.getPrice()+" Inserted...");
		close();
	}

	@Override
	public Object select(Object obj) {
		Product p = null;
		String str = (String)obj;
		// DB에서 SELECT해서 데이터를 가지고 온다.
		connection();
		p = new Product("p01", "pants", 10000);
		close();
		return p;
	}

	@Override
	public void delete(Object obj) {
		String str = (String)obj;
		connection();
		System.out.println(str+" Deleted...");
		close();
	}

}
