package array1;

import java.util.Arrays;
import java.util.Random;

public class Arr3 {
	public static void main(String[] args) {
		int a[]= new int[30];
		//10~99������ ���ڸ� �����ϰ� �迭�� �Է� 
		//�հ� ����� ���Ͻÿ�.
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
		System.out.printf("��: %d\n",sum);
		System.out.printf("���: %.2f\n",avg);
		System.out.println("---------------------");
		
		
		// �ִ밪�� �ּҰ������ �Ͻÿ�
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
		System.out.println("�ִ밪 :"+ max);
		System.out.println("�ּҰ� :"+ min);
		// ���� �� ���� ���� �Ͻÿ� 
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
		
		// ū������ �����Ͻÿ�
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
		// �迭�� �ִ� ���� ���ڵ��� ���� ���Ͻÿ�
		int count[] = new int[100];
		for(int i=0; i<a.length;i++) {
			count[a[i]] ++; 
			
		}
		for(int i= 0; i<count.length; i++) {
			System.out.println(i+":"+count[i]);
		}
	}
}
