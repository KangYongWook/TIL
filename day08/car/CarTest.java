package car;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(car1);//  원래 car1.toString 이라선언해야하지만 JVM에서 알아서 찾아서 해줌
		try { //정상일때일로들어가고
			car1.setCfSize(40);
		} catch (Exception e) { // 잘못되면 일로들어감
			System.out.println("Too much ...");
		}
		System.out.println(car1);
		car1.go(4);
		System.out.println(car1);
	}
}
