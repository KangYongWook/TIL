package array1;

import java.util.Random;

public class Arr1 {
	
	public static void main(String[] args) {
		int i = 10;
		int a[] = new int[9];// reference 타입으로 Heap 메모리 영역에 저장되고 stack는 주소가 저장됨
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
		
		// a 배여의 각 인덱스에 
		// 1~9까지의난수를 발생 하여 입력하시오
		// for문 사용
		
		Random r = new Random();
		for(int in= 0; in< a.length;in++) {
			
			a[in] = r.nextInt(9)+1;  //0에서 8까지인데 1더해서 1~9까지
		
			
		}
		System.out.println(a);
		System.out.println(a.length);
		System.out.println("-------------------");
		
//		for(int ind=0 ; ind < a.length ; ind ++) {
//			
//			System.out.println(a[ind]);
//			
//		}
//		
		for(int temp:a) {
			System.out.println(temp);
		}
	}

}
