package ws.component;

import ws.cafe.Cafe;
import ws.interf.Coffekinds;
import ws.vo.User;

public class Homemade extends Cafe<String, User> implements Coffekinds<String, User> {

	@Override
	public void Americano(String k) {
		if (k.equals("Americano")) {
			System.out.println("Americano");
		}
	}

	@Override
	public void Latte(String k) {
		if (k.equals("Latte")) {
			System.out.println("Latte");
		}
	}

	@Override
	public void Espresso(String k) {
		if (k.equals("Espresso")) {
			System.out.println("Espresso");
		}

	}

	@Override
	public void order(User v) throws Exception {
		
		if (v.getCoffee().equals("Americano")) {
			Americano(v.getCoffee());
		}
		if (v.getCoffee().equals("Latte")) {
			Latte(v.getCoffee());
		}
		if (v.getCoffee().equals("Espresso")) {
			Espresso(v.getCoffee());
		}
		System.out.println(" 주문이 완료됐습니다.");
	}

}
