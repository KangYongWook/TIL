package car;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car(); //default car
		System.out.println(car1);//JVM에서 자동으로 toString 호출
//		try {
//			car1.setCfSize(50);
//		}catch( Exception e) {
//			System.out.println("Too Much ....");
//		}
//		System.out.println(car1);
//		
//		car1.go(4);
//		System.out.println(car1);
	}

}
