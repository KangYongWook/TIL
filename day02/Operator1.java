package day02;

public class Operator1 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		int result = ++a + ++b;
		
		
		System.out.println(a+" " + b+" " +result);
		
		int a1 = 10;
		int b1 = 10;
		int result1 = a1++ + b1++;

		System.out.println(a1+" " + b1+" " +result1);
		
		if(a++ < 20 || b++ < 20) {
			System.out.println(a+" "+ b );
		}
		
		double i1 = 10 ;
		double i2 = 0;
		double i3 = i1/i2;
		System.out.println(i3);
	}

}
