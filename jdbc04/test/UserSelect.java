package test;

import com.UserBiz;

import frame.Biz;
import vo.User;

public class UserSelect {
		public static void main(String[] args) {
			Biz<String,User> biz = new UserBiz();
			String id = "id66";
			try {
				System.out.println(biz.get(id));
			}catch(Exception e){
				e.printStackTrace();
				
			}
		}

}
