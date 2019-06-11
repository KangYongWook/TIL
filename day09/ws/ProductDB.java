package ws;

import java.util.ArrayList;

public class ProductDB extends DB<Product, Integer> {

	ArrayList<Product> list = new ArrayList<>();

	@Override
	public void create(Product obj) {
		Product Product = (Product) obj;
		list.add(new Product(Product.getId(), Product.getName(), Product.getPrice()));

		System.out.println(Product.getId() + " Inserted");
	}

	@Override
	public Product select(Integer obj) {
		Product Product = null;
		int str = obj;
		Product = list.get(0);
		return Product;
	}

	@Override
	public void select() {
		for (Product u : list) {
			System.out.println(u);
		}
	}

	@Override

	public void delete(Integer obj) {
		int a = obj;
		list.remove(a);
	}

	@Override
	public ArrayList<Product> update(Product obj) {
		Product Product = (Product) obj;
		list.set(Product.getId(), new Product(Product.getId(), Product.getName(), Product.getPrice()));
		return list;
	}

}
