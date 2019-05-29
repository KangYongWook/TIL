package inter;

public class View  {
	public static void main(String[] args) {
		Shop shop = new Gmarket();//추상클래스는 객체를 생성할수없다
		
		
		shop.register();
		shop.login();
		shop.logout();
		shop.order();
		
		
		
		
	}

}
