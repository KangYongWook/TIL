package ws;

import java.util.ArrayList;
import java.util.HashMap;

import db3.Product;
import set.User;

public class UserDB extends DB<User, String> {

	@Override
	public void intsert(User obj) {
			System.out.println(obj.getId()+ " "+ obj.getName()+ " " + obj.getPwd() +" Inserted");
	}

	@Override
	public User select(String obj) {
		 User u = null;
		 System.out.println("Search:" + obj);
		 u= new User("¿ë", "Pants", "10000");
		 
		return u;
	}

	@Override
	public HashMap<Integer, Product> selectall() {
		 
		HashMap<Integer,Product>
		
		map = new HashMap<>();
		
		map.put(111, new Product(111, "T", 10000));
		map.put(222, new Product(222, "T", 10000));
		map.put(333, new Product(333, "T", 10000));
		map.put(444, new Product(444, "T", 10000));
		map.put(555, new Product(555, "T", 10000));
		
		
		
		Product p = map.get(222);
		System.out.println(p);
		return map;
	}

	@Override
	public void update(User obj) {
		
		
	}

	@Override
	public void delete(String obj) {
		
		list.remove(3);
		
	}

}
