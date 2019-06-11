package transportation;


public class TransTest {

	public static void main(String[] args) {
		Transportation s[] = new Transportation[4];
		s[0] = new Bus(new Location(1,1,100,100));
		s[1] = new Subway(new Location(2,2,100,100));
		s[2] = new Taxi(new Location(3,3,200,200),"���");
		s[3] = new Taxi(new Location(3,3,200,200),"�Ϲ�");
		
		for(Transportation t: s) {
			if( t instanceof Taxi) {
				Taxi taxi =(Taxi)t;
				taxi.paymentMethod("�ĺ�");
			}
			
			System.out.println(t.toString());
			System.out.println("Fee: "+t.getFee()+"��");
		}
	}

}
