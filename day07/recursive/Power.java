package recursive;

public class Power {

	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		int result = 0;
		result = power(x,n);
		System.out.println(result);

	}
	
	private static int power(int x, int n) {
		int result=0;
		if(n==1) {
			return x;
		} 
		result=pow(x, n)+power(x,n-1);	
		return result;
	}

	private static int pow(int x, int n) {
		int result=0;
		if(n==0) {
			return 1;
		}
		result = x*pow(x,n-1);
		return result;
	}

}
