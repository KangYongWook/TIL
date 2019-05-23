package array1;

import java.util.Arrays;
import java.util.Random;

public class Arr4 {
	public static void main(String[] args) {
		int a [] = new int[100];
		// 1~4 까지의 숫자를 랜덤하게 배열에 입력
		//합과 평균을 구하시오.
		Random r = new Random();
		for(int i=0; i< a.length; i++) {
			a[i] = r.nextInt(4)+1;  // 0~4 까지의 숫자를 랜덤생성 하여 넣음 
		}
		System.out.println(Arrays.toString(a));
		
		int count[] = new int[5];
		int count1[] = {};
		// 투표 결과를 count 배열에 합산 하시오
		
		for(int i=0; i<a.length ; i++) {
			for(int c=1; c<count.length;c++) {
				if(a[i]==c) {
					count[c]++;
				}
			}
		}
		for(int c =0 ; c < count.length; c++) {
			System.out.println(c+" : " +count[c]);
		}
		
	}

}
