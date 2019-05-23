package day02;

public class Operator4 {

	public static void main(String[] args) {
		String result = "";
		int a = 10;
		int b = 20;
		result = (a>b) ? "A" : "B" ; //3항연산자 비교할때 if문대신씀
		
//		if(a>b) {
//			result = "A";
//		}
//		else {
//			result = "B";
//		}
		System.out.println(result);
		
		int i1 = 20;
		int i2 = 30;
		int i3 = 10;
		
		
		
		
		// 최대 값을 구하시오
		//단, 3항연산자를이용할것
		
		int max =(i1>i2) ?(i1>i3? i1:i3):( (i2>i3) ? i2 :i3) ;
		
		 
		 
		System.out.println(max);
	}

}
