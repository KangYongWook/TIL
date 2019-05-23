package calc;

import java.util.Arrays;



public class CalcTest {
	
	public static void main(String[] args) {
		int a [] = {5,3,7,6,2,1};
		Calc c = new Calc(a);
		System.out.println(c.sum());
		try {
		System.out.println(c.avg());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(Arrays.toString(c.asort()));
		System.out.println(Arrays.toString(c.dsort()));
	}

}
