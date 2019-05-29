package com.sds.test;

import java.util.ArrayList;

import com.sds.component.UserBiz;
import com.sds.frame.Biz;
import com.sds.vo.User;

public class UserSelectAll {
	public static void main(String[] args) throws Exception {
		Biz<String,User> biz = new UserBiz();
		ArrayList<User> list = null;// ����ڵ��� ���� �־���
		try {
			list = biz.get(); //����� �����ּ���
			for(User u:list) {
				System.out.println(u);
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}
}
