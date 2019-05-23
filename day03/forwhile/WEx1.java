package forwhile;

public class WEx1 {
	public static void main(String[] args) {
		//for
		for(int i=1;i<10; i ++) {
			System.out.println(i);
		}
		// while
//		int i=1;
//		while(i<10) {
//			System.out.println(i);
//			i++;
//			}
			//2중 for문
		System.out.println("***************************");
			for(int a=0; a<=10 ;a++) {
				for(int b=10; b>0; b--) {
					System.out.println(a+" "+b);
				}
			}
			//while로 변경
			int a=0, b=10;
			System.out.println("***************************");
			while(a<=10) {
				
				b=10;
				while(b>=0) {
					System.out.println(a+" "+b);
					b--;
				}
				a++;
			}
		}


}
