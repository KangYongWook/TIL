package recurcive;

public class Power {
	
	public static void main(String[] args) {
		int x= 2;
		int n =5;
		int result = 0; //2에 5승까지의 합 	
		
		for(int i=1; i<=n; i++) {
			result += power(x,i);
		}
		System.out.println(result);
	}
	
	public static int power(int x,int n) {
		int result = 0;
		if(n==1) {
			return x;
		}
		else {
			result = x* power(x,n-1);
		}
		return result;
	}
}
