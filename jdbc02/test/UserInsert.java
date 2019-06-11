package test;

import com.UserDao;

import frame.Dao;
import vo.User;

public class UserInsert {

	public static void main(String[] args) {
		Dao<String,User> dao = new UserDao();
		User user = new User("id55", "pwd55", "ÀÌ¸»¼÷");
		try {
			dao.insert(user);
			System.out.println("User Inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}





