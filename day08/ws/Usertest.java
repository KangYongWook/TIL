package ws;

public class Usertest {
	public static void main(String[] args) {
		Engine g1 = new Engine(4000, 4);
		Engine g2 = new Engine(3000, 6);
		
		Car c1= new Car("페라리",g1, "red");
		Car c2= new Car("마세라티",g2, "white");
		
		Car cars[] = {c1,c2};
		
		User u1 = new User("강용욱", cars);
		
		System.out.println(u1.toString());
		
	}
}
