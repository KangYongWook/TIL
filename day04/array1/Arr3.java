package array1;

import java.util.Arrays;
import java.util.Random;

public class Arr3 {
	public static void main(String[] args) {
		int a[]= new int[30];
		//10~99까지의 숫자를 랜덤하게 배열에 입력 
		//합과 평균을 구하시오.
		Random r = new Random();
		int sum = 0;
		double avg = 0;
		
		for(int idx = 0; idx < a.length ; idx++)
		{
			a[idx] = r. nextInt(90)+10;
			sum += a[idx];
		}
		
		avg = sum/(double)a.length;
		
		System.out.println(Arrays.toString(a));
		System.out.printf("합: %d\n",sum);
		System.out.printf("평균: %.2f\n",avg);
		System.out.println("---------------------");
		
		
		// 최대값과 최소값을출력 하시오
		int max = a [0];
		for(int i =1 ; i <a.length; i++) {
			if(a[i] >max) {
				max = a[i];
			}
				
		}
		int min = a [0];
		for(int i =1 ; i <a.length; i++) {
			if(a[i] < min) {
				min = a[i];
			}
				
		}
		System.out.println("최대값 :"+ max);
		System.out.println("최소값 :"+ min);
		// 작은 수 부터 정렬 하시오 
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		// 큰수부터 정렬하시오
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j] < a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		// 배열에 있는 같은 숫자들의 합을 구하시오
		int count[] = new int[100];
		for(int i=0; i<a.length;i++) {
			count[a[i]] ++; 
			
		}
		for(int i= 0; i<count.length; i++) {
			System.out.println(i+":"+count[i]);
		}
	}
}
