package array1;

import java.util.Arrays;
import java.util.Random;

public class Arr4 {
	public static void main(String[] args) {
		int a [] = new int[100];
		// 1~4 ������ ���ڸ� �����ϰ� �迭�� �Է�
		//�հ� ����� ���Ͻÿ�.
		Random r = new Random();
		for(int i=0; i< a.length; i++) {
			a[i] = r.nextInt(4)+1;  // 0~4 ������ ���ڸ� �������� �Ͽ� ���� 
		}
		System.out.println(Arrays.toString(a));
		
		int count[] = new int[5];
		int count1[] = {};
		// ��ǥ ����� count �迭�� �ջ� �Ͻÿ�
		
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
