package forwhile;

import java.util.Scanner;

public class ForEx1 {
	public static void main(String[] args) {
//		System.out.println("Start");
//		
//		int i,j;
//		
//		
//		// 1부터 10까지출력 하시오
//		// 홀수만 출력하시오
//		for( i=1; i < 10 ; i++) {  // i+=2  로 수정하고 조건문안써도됨
//			
//			if( i % 2 != 0)
//			System.out.println(i);
//			
//		}
//		//System.out.println();
//		System.out.println("End");
//		
//		for( i=1,j=1; i < 10 && j<=5 ; i++,j++) {  // i+=2  로 수정하고 조건문안써도됨
//			
//			
//			System.out.println(i+"   "+j+",");
//		}	
//		System.out.println("Last Value" + (i+j));
//		System.out.println("End");
//	}
		// 두수의 곱이 5의 배수인 것들의 합을 구하시오.
		int i =1 , j=10;
		int sum = 0;
		for(;i <=10 && j>0; i++, j--) {
			
			
			System.out.println(i+ "  "+ j );
			if( (i*j) % 5 == 0 )
			{
				sum +=(i*j);
			}
		}
		System.out.println(" SUM : "+ sum);
		
		
		
		
	}
}
