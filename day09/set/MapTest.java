package set;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		HashMap<Integer,Product>
		map = new HashMap<>();
		
		map.put(111, new Product(111,"T",10000));
		map.put(222, new Product(222,"T",10000));
		map.put(333, new Product(333,"T",10000));
		map.put(444, new Product(444,"T",10000));
		map.put(555, new Product(555,"T",10000));
		
		System.out.println(map.size());
		
		Product p = map.get(222);
		System.out.println(p);
	}

}
