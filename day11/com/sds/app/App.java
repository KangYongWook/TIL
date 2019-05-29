package com.sds.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.sds.component.ProductBiz;
import com.sds.component.UserBiz;
import com.sds.frame.Biz;
import com.sds.vo.Product;
import com.sds.vo.User;

public class App {
	public static void main(String[] args) {
		
		Biz<String,User> ubiz = new UserBiz();
		Biz<Integer, Product> pbiz= new ProductBiz();
		
		
		Scanner sc = new Scanner(System.in);
		
		out:
		while(true) {
			System.out.println("MENU:r,g,q....");
			String cmd =sc.next();
			switch(cmd) {
			case"r":
				System.out.println("Input User Info");
				String id = sc.next();
				String pwd = sc.next();
				String name = sc.next();
				User u1 = new User(id,name,pwd);
				try {
					ubiz.register(u1); // DB에들어감
					System.out.println("Insert Completed");
				}catch(Exception e) {
					System.out.println("Insert Error");
					System.out.println(e.getMessage());
				}
				break;
			case"g":
				ArrayList<User> list = null;// 사용자들의 집합 넣어줌
				try {
					list = ubiz.get(); //사용자 집합주세요
					for(User us:list) {
						System.out.println(us);
					}
				}catch(Exception e){
					System.out.println("Get Error");
				}
				
				break;
			case"q":
				System.out.println("Bye...");
				break out;	
				
			}
		}
		sc.close();
		
		
		
		
		
		
	}
	

}
