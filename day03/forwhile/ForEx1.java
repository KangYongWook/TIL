package forwhile;

import java.util.Scanner;

public class ForEx1 {
	public static void main(String[] args) {
//		System.out.println("Start");
//		
//		int i,j;
//		
//		
//		// 1���� 10������� �Ͻÿ�
//		// Ȧ���� ����Ͻÿ�
//		for( i=1; i < 10 ; i++) {  // i+=2  �� �����ϰ� ���ǹ��Ƚᵵ��
//			
//			if( i % 2 != 0)
//			System.out.println(i);
//			
//		}
//		//System.out.println();
//		System.out.println("End");
//		
//		for( i=1,j=1; i < 10 && j<=5 ; i++,j++) {  // i+=2  �� �����ϰ� ���ǹ��Ƚᵵ��
//			
//			
//			System.out.println(i+"   "+j+",");
//		}	
//		System.out.println("Last Value" + (i+j));
//		System.out.println("End");
//	}
		// �μ��� ���� 5�� ����� �͵��� ���� ���Ͻÿ�.
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
