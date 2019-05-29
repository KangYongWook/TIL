package TRS;

public class TransportationTest {
	public static void main(String[] args) {
		
		Public tr = new Public(1000, 10.0 , 10 , 20 ,"용",new Point(3,3),new Point(12,2));
		Car cars = new Car(1000, 10.0, 10 , 20 , "강" ,new Point(3,3),new Point(12,2));
		walking wk = new walking(1000, 10, 10, 30, "욱" , new Point(3,3),new Point(12,2));
		
		tr.c_distance();
		tr.c_time();
		tr.c_fee();
		
		cars.c_distance();
		cars.c_time();
		
		
		wk.c_distance();
		wk.c_time();
		wk.c_fee();
		
		
		System.out.println(tr); 
		System.out.println(cars);
		System.out.println(wk);
		System.out.println("요금"+cars.c_fee());
			 

		
	}
	
	
}
