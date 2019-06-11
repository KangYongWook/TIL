package db;

public class ProductBiz extends Biz {

	Dao dao;

	public ProductBiz(String ip) {
		dao = new ProductDao(ip);
	}

	@Override
	public void register(Object obj) {
		//Transaction start ...
		dao.insert(obj);
		//Transaction end ...
	}

	@Override
	public void remove(Object obj) {
		//Transaction start ...
		dao.delete(obj);
		//Transaction end ...
	}

	@Override
	public Object get(Object obj) {
		Product product = null;
		//Transaction start ...
		product = (Product)dao.select(obj);
		//Transaction end ...
		return product;
	}

}
