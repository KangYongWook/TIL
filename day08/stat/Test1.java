package stat;

public class Test1 {
	static int temp = 0;
	public static int max(int a , int b) {
		int max = 0;
		if(a>b) {
			max= a;
		}else {
			max=b;
		}
		return max;
			
	}
	public static void main(String[] args) {
		
		int a= 10;
		int b= 20;
		
		temp = max(a,b);
		System.out.println(temp);
		
		
	}
}
