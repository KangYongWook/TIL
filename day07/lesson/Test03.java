package lesson;

import java.util.Arrays;
import java.util.Random;

public class Test03 {
	public static void main(String[] args) {
		
		int temp=0;
		int a[] = new int[10];
		
		Random r = new Random();
		// ��������
		for(int i=0; i<10; i++) {
			a[i] = r.nextInt(90)+10;
		}
		// ū������ ����
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(a[i]>= a[j]) {
					temp=a[i];
					a[i] = a[j];
					a[j]= temp;
				}
			}				
		}
		System.out.println(Arrays.toString(a));
		
		//��������������
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(a[i]<= a[j]) {
					temp=a[i];
					a[i] = a[j];
					a[j]= temp;
				}
			}				
		}
		
		
		System.out.println(Arrays.toString(a));
	}
}
