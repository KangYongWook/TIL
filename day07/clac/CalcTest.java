package clac;

import java.util.Arrays;

public class CalcTest {

	public static void main(String[] args) {
		int data[] = {1,2,3,4,5};
		
		Calc calc = new Calc(data);
		System.out.println(calc.sum(data));
		System.out.println(calc.avg(data));
		System.out.println(Arrays.toString(calc.asort(data)));
		System.out.println(Arrays.toString(calc.dsort(data)));
	}

}
