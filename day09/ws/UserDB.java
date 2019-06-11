package ws;

import java.util.ArrayList;

public class UserDB extends DB<User, Integer> {

	ArrayList<User> list = new ArrayList<>();

	@Override
	public void create(User obj) {
		User user = (User) obj;
		list.add(new User(user.getId(), user.getName(), user.getPwd()));

		System.out.println(user.getId() + " Inserted");
	}

	@Override
	public User select(Integer obj) {
		User user = null;
		int str = obj;
		user = list.get(0);
		return user;
	}

	@Override
	public void select() {
		for (User u : list) {
			System.out.println(u);
		}
	}

	@Override
	
	public void delete(Integer obj) {
		int a = obj;
		list.remove(a);
	}

	@Override
	public ArrayList<User> update(User obj) {
		User user = (User) obj;
		list.set(user.getId(), new User(user.getId(), user.getName(), user.getPwd()));
		return list;
	}

}
