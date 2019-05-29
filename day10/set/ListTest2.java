package set;

import java.util.ArrayList;

public class ListTest2 {
	
	public static void main(String[] args) {
		ArrayList<User> list = new ArrayList<>();
		list.add(new User("id01", "james", "pewd01"));
		list.add(new User("id02", "james", "pewd02"));
		list.add(new User("id03", "james", "pewd03"));
		list.add(new User("id04", "james", "pewd04"));
		list.add(new User("id05", "james", "pewd05"));
		
		System.out.println(list.size());
		list.remove(3);
		for(User u:list) {
			System.out.println(u);
		}
	}

}
