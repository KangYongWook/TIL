package test;

import com.UserBiz;

import frame.Biz;
import vo.User;

public class UserDelete {
	public static void main(String[] args) {
		Biz<String,User> biz = new UserBiz();
		String id = "id55";
		try {
			biz.remove(id);
			System.out.println("User Deleted");
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
