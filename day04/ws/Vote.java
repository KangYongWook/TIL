package ws;

import java.util.Arrays;
import java.util.Random;
//import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		
		int a[] = new int[50]; //��ǥ����
		int b[] = new int[5]; //�ĺ��� ���� ��ǥ����
		int c[] = new int[5]; 
		int d[] = new int[5];
		int index = 0;
		int index1 = 0;
		int temp = 0;
		int maxpp = 0 ;// ���� ���̹��� ���
		int minpp = 0;// ���� ���� ���� ���
	//	Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("��ǥ�� ���� ���ּ��� �ĺ� 1~5");
		
		for(int i = 0 ; i < a.length; i++) {
			 a[i] = rd.nextInt(5)+1;
			 
			 if(a[i]<0 || a[i]>5)
			 {
				 System.out.println("�ٽ� �Է����ּ���");
				 i--;
				 continue;
			 }
		}
		//��ǥ ����� a[i] �� b[]�� ����־���
			for(int i = 0 ; i<a.length ;i++) {
				if(a[i] == 1) { b[0]++;}
				if(a[i] == 2) { b[1]++;}
				if(a[i] == 3) { b[2]++;}
				if(a[i] == 4) { b[3]++;}
				if(a[i] == 5) { b[4]++;}
			}
		// ���� ��ǥ���� ���� �ĺ�
	
		for(int i= 0 ;i < b.length; i++)
		{
			if(maxpp < b[i])
			{
				maxpp = b[i] ;
				index = i;
			}
		}
	
		
		// ���� ��ǥ ���Թ��� �ĺ�
		minpp = b[0];
		for(int i= 1 ;i <b.length; i++)
		{
			
			if(minpp >= b[i])
			{
				minpp = b[i] ;
				index1 = i;
			}
		}
		
		
		System.out.println("��ǥ�� : " + Arrays.toString(a));
		System.out.println("�ĺ��� ���� ��ǥ : " + Arrays.toString(b));
		
		System.out.println("��ǥ�� ���� ���� ���� ��ǥ�� : " + maxpp);
		System.out.println("��ǥ�� ���� ���� ���� ��ǥ�� : " + minpp);
		System.out.println("��ǥ�� ���� ���� ���� �ĺ� : " + (index+1));
		System.out.println("��ǥ�� ���� ���� ���� �ĺ� : " + (index1+1));
		
		// ��ǥ����� ��ü����
				for(int i = 0 ; i <d.length ; i++) {
					for(int j=0; j<d.length ; j++)
					{
						if(b[i]>b[j]) {
							temp = b[i];
							b[i]=b[j];
							b[j] = temp;
						}
					}
				}
				for(int i = 0 ; i<d.length; i++)
				{
					c[i] = b[i];
				}
				//
				for(int i = 0 ; i<d.length ; i++) {
					for(int j=0; j<d.length ; j++) {
						if(b[i]<b[j])
						{
							temp = b[i];
							b[i] = b[j];
							b[j] = temp;
						}
					}
				}
				for(int i =0; i<5; i++)
				{
					d[i] = b[i];
				}
		
		System.out.println("��ǥ�� ���� ���� ���� ���� : " + Arrays.toString(c));
		System.out.println("��ǥ�� ���� ���� ���� ���� : " + Arrays.toString(d));
	}
	
}
