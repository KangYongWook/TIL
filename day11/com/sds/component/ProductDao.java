package com.sds.component;

import java.util.ArrayList;

import com.sds.frame.Dao;
import com.sds.vo.Product;
import com.sds.vo.User;

public class ProductDao extends Dao<Integer, Product> {

	@Override
	public void insert(Product v) throws Exception {
		if(v.getId()==2222) {
			throw new Exception("Duplicated ID");
		}
		System.out.println(v+ "Inserted.");
	}
	@Override
	public void delete(Integer k) throws Exception {
		if(k==2222) {
			throw new Exception("E0002");
		}
		System.out.println(k+ "Delete....");
		
	}

	@Override
	public void update(Product v) throws Exception {
		if(v.getId()==2222) {
			throw new Exception("E0003");
		}
		System.out.println(v+ "Updated....");
		
		
	}

	@Override
	public Product select(Integer k) throws Exception {
		Product product = new Product(k, "james", 1000);
		
		return product;
	}

	@Override
	public ArrayList<Product> select() throws Exception {
		ArrayList<Product> list = new ArrayList<>();
		list.add(new Product(1111,"t1",1000));
		list.add(new Product(3333,"t2",2000));
		list.add(new Product(4444,"t3",3000));
		list.add(new Product(5555,"t4",4000));
		list.add(new Product(6666,"t5",5000));

		return list;
	}

}
