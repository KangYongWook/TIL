package ws;

import java.util.Arrays;
import java.util.Random;

public class SumTest {

	public static void main(String[] args) {
		
		int num[] = new int[100];
		int save1[] = new int[50];
		int save2[] = new int[50];
		int sum[] = new int[25];
		
		//1~100까지의 중복없는 난수 생성
		Random r = new Random();
		for(int i=0; i<num.length;i++) {
			num[i] = r.nextInt(100)+1;
			for(int j = i-1; j>=0;j--) {
			if(num[j] == num[i]) {
				
				num[i] = r.nextInt(100)+1;	
				j = i;
				}
			}

		}
		
		//짝수 배열, 홀수 배열 저장
		int j = 0;
		int k = 0;
		for(int i=0; i<num.length;i++) {
			if(num[i]%2 == 0) {
				save1[j]=num[i];
				j++;
			}else {
				save2[k]=num[i];
				k++;
			}
		}
		
		//짝수 1 + 홀수 50, 짝수 2+ 홀수 49......더한 값
		for(int i=0; i<sum.length;i++) {
			sum[i]=save1[i]+save2[save2.length-1-i];
		}
		
		System.out.println("1~100까지 수:"+Arrays.toString(num));
		System.out.println("짝수 배열: "+Arrays.toString(save1));
		System.out.println("홀수 배열: "+Arrays.toString(save2));
		System.out.println("Sum   : "+Arrays.toString(sum));
	}
}