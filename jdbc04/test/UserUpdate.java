package test;

import com.UserBiz;

import frame.Biz;
import vo.User;

public class UserUpdate {
		public static void main(String[] args) {
			Biz<String,User> biz = new UserBiz();
			User user = new User("id20","james","pwd20");
			try {
				biz.modify(user);
				System.out.println("User Updated");
			}catch(Exception e){
				e.printStackTrace();
				
			}
	}

}
