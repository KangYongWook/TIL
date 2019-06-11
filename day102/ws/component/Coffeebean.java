package ws.component;

import ws.cafe.Cafe;
import ws.interf.Coffekinds;
import ws.interf.Takeout;
import ws.vo.User;

public class Coffeebean extends Cafe<String, User> implements Coffekinds<String, User>, Takeout {

	@Override
	public void takeout() {
		System.out.println("take-out");

	}

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
		System.out.println(" �ֹ��� �Ϸ�ƽ��ϴ�.");
	}


}
