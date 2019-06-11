package car;

public class CarTest2 {

	public static void main(String[] args) {
		Car cars [] = new Car[3];
		cars[0] = new Car("k1", "Yellow", 60, 90);
		cars[1] = new Car("k2", "Red", 70, 100);
		cars[2] = new Car("k3", "Blue", 80, 80);
		
		for(Car c:cars) {
			try {
				c.setCfSize(70);
			} catch (Exception e) {
				System.out.println(c.getName()+" "+"Too Much Fuel Size..");
			}
			System.out.println(c);
		}
	}

}
