package forwhile;

public class WEx6 {
	public static void main(String[] args) {
		// 구구단을출력 하시오
		// 홀수단만출력하시오
		// 7단까지만 출력 하시오
		// 결과가 49일때 멈추세요
		//int go ;
	//	outer:
		for(int i=2; i<=9; i++) {
//			if (go == 1) {
//				break
//			}
			
			if( i% 2 == 0) {
				continue;
			}
			
			for(int j=1; j<=9; j++) {
				int result = i * j ;
				
				if (result == 49) {
					return;
//					go= 1;
//					break;
					//break outer;
				}
				System.out.printf("%d  x %d = %d \n",i,j,result);
				
			}
			System.out.println("");
		}
	}

}
