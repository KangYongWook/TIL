package ws;

public class Usertest {
	public static void main(String[] args) {
		Engine g1 = new Engine(4000, 4);
		Engine g2 = new Engine(3000, 6);
		
		Car c1= new Car("���",g1, "red");
		Car c2= new Car("������Ƽ",g2, "white");
		
		Car cars[] = {c1,c2};
		
		User u1 = new User("�����", cars);
		
		System.out.println(u1.toString());
		
	}
}
