package ws.test;

import ws.cafe.Cafe;
import ws.component.Starbucks;
import ws.vo.User;

public class test {

	public static void main(String[] args) {
		String coffee = "Latte";
		String place = "Starbucks";
		double price = 5000;
		User user = new User(coffee, place, price);
		Cafe<String, User> db = new Starbucks();
		Starbucks star = new Starbucks();
		try {
			db.order(user);
			star.takeout();
			System.out.println(user.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
