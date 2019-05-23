package ws;

import java.util.Arrays;
import java.util.Random;

public class SumTest {
	public static void main(String[] args) {
		
//		1. 100개의 정수형 배열에 1~100까지의 숫자를 난수로 발생 시킨다. 중복 허용하지 않는다. 
//		2. 짝수 번째에 있는 정수들만 50개의 배열에 저장
//		3. 홀수 번째에 있는 정수들만 50개의 배열에 저장 
//		4. 짝수 번째 배열의 첫번째 숫자와 홀수 번째 배열의 마지막 숫자를 합산, 다시 짝수 번째 두번째 숫자는 홀수 번째 배열의 마지막에서 두번째 숫자와의 합산 ....... 이런식으로 합산한 결과를 출력 하시오 



	int a[] = new int[100] ;  // 난수발생 저장배열
	int evennum[] = new int[50] ;  // 짝수발생 저장배열
	int oddnum[] = new int[50] ;  // 홀수발생 저장배열
	int allnum[] = new int[50];
	Random rd = new Random() ;
	
	// 노중복 100 개난수 생성 
	for(int i=0; i<100 ; i++) {
		a[i] = rd.nextInt(100)+1;
		for(int j=0; j<i; j++) {
			if(a[i] == a[j]) {
				i--;
				}
			}
		}
	for(int i=0; i<50; i++) {
		evennum[i] = a[i*2]; //짝수번째에 있는 정수들만 
		oddnum[i] = a[(i*2)+1]; // 홀수번째 있는 정수들만
	}
	
	
		for(int j=0; j<50; j++)
		{
		
			allnum[j] = evennum[j] + oddnum[49-j];
		}
	
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(evennum));
	System.out.println(Arrays.toString(oddnum));
	System.out.println(Arrays.toString(allnum));	
	}
}
