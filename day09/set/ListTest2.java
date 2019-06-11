package set;

import java.util.ArrayList;

import db2.User;

public class ListTest2 {

	public static void main(String[] args) {
		
		ArrayList<User> list =
				new ArrayList<>();
		list.add(new User("id01","james","pwd01"));
		list.add(new User("id02","james","pwd01"));
		list.add(new User("id03","james","pwd01"));
		list.add(new User("id04","james","pwd01"));
		list.add(new User("id05","james","pwd01"));
		
		System.out.println(list.size());
		list.remove(3);
		for(User u:list) {
			System.out.println(u);
		}
	}

}
