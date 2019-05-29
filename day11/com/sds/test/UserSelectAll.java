package com.sds.test;

import java.util.ArrayList;

import com.sds.component.UserBiz;
import com.sds.frame.Biz;
import com.sds.vo.User;

public class UserSelectAll {
	public static void main(String[] args) throws Exception {
		Biz<String,User> biz = new UserBiz();
		ArrayList<User> list = null;// 사용자들의 집합 넣어줌
		try {
			list = biz.get(); //사용자 집합주세요
			for(User u:list) {
				System.out.println(u);
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}
}
