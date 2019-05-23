package forwhile;

public class WEx3 {
	
	public static void main(String[] args) throws InterruptedException {
//		int i = 0;// 0부터할거면-1넣자
//		while(++i <=10) {
//			
//			System.out.println(i);
//		
//		}
//		///////////////////////
//		int k = 5;
//		while(k !=0) {
//			System.out.println(k);
//		}
//		////////////////////
		int z = 5;
		while(z-- != 0) {
			Thread.sleep(1000);
			System.out.println(z);
		}
	}

}
