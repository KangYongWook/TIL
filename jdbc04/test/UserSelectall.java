package test;

import java.util.ArrayList;

import com.UserBiz;

import frame.Biz;
import vo.User;

public class UserSelectall {
	public static void main(String[] args) {
		Biz<String,User> biz = new UserBiz();
			ArrayList<User> a;
			try {
				a = biz.get();
				for(User u: a) {
					System.out.println(u);
				}
			}catch(Exception e){
				e.printStackTrace();
				
			}
	}

}
