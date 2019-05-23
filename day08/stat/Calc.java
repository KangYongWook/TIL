package stat;

public class Calc {
	public static int sum(int a,int b) {
		return(a+b);
		
	}
	public static int sum(int a[]) {
		int sum =0;
		for(int data: a) { // 오른쪽배열선언하고 앞에는 그냥 변수선언 
			sum += data;
		}
		return sum;
		
	}

}
