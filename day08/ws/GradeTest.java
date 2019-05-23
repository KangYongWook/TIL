package ws;

import java.util.Arrays;

public class GradeTest {
	public static void main(String[] args) {
		
		int a[] = {40,50,50,30};
		Grade gr = new Grade(a);
		System.out.println(gr.sum());
		System.out.println(gr.avg());
		System.out.println(gr.credit());
		System.out.println(Arrays.toString(gr.asort()));
		System.out.println(Arrays.toString(gr.dsort()));
		System.out.println(gr.high());
		System.out.println(gr.low());
	}
	
}
