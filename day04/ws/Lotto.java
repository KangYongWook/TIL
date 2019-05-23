package ws;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
			/*1.6���� ���� �Է� (����: 1~10)
			2.�� ���� ��÷��ȣ 6�� ����(���� : 1~10) �ߺ����� �ʴ� ���� ����
			3.��÷�� ���� (����: 10��~100��)
			4.�Է� ���� ���ڿ� ��÷��ȣ Ȯ��
			-3�� ������ : 4�� (��÷�� 5%)
			-4�� ������ : 3�� (��÷�� 10%)
			-5�� ������ : 2�� (��÷�� 20%)
			-6�� ������ : 1�� (��÷�� 50%)*/
		
		Scanner sc = new Scanner(System.in); // �Է¹���
		Random rd = new Random();   // ��÷��ȣ ���� �� �ݾ׻���
		String str = "";
		
		int a[] = new int[6]; // ��÷��ȣ �迭
		int b[] = new int[6]; // �ζǹ�ȣ �迭
		long money = 0 ; //�� ��÷ �ݾ�
		long money2 = 0;  // ��÷�ݾ�
		int cnt = 0 ; 	
		money = (rd.nextInt(900000000) + 100000000 ) * 10L; //10��~100��
		//�����Է� 
		System.out.println("6���� ���ڸ� �Է��Ͻÿ� ���� : 1~10 ");
		
		// �����Է�
		for(int i=0; i<6; i++) {
			a[i] = sc.nextInt();	
			
			if(a[i] > 10 || a[i] < 0) {
				System.out.println("�ٸ� �����ԷµǾ����ϴ�. ���α׷� ����");
				return;
			}
		}
		
		// �ߺ������ʴ� ��÷��ȣ
		for(int i=0; i<b.length ; i++) {
			b[i] = rd.nextInt(9)+1; //1���� ~ 10
			for(int j=0; j<i; j++) {
				if(b[i] == b[j]) {
					i--;
				}
			}
		}
		// ����ȣ�� �ζǹ�ȣ �ߺ� ��ȣ  check
		for (int i= 0 ; i < 6;i++) {	
			for(int j=0 ; j <6 ; j++) {	
			if(a[i] == b[j]) 
				cnt ++;
			}
		}
		
		
		System.out.printf("�� ��ȣ\t:");
		for(int i=0; i<6; i++) {
			System.out.printf("  "+ a[i]);
		}
		System.out.println();
		System.out.printf("�ζ� ��ȣ\t:");
		for(int i=0; i<6; i++) {
			System.out.printf("  "+ b[i]);
		}
		
	
		
		if(cnt == 3) { str = "4��" ; money2 = (long) (money * 0.05); }
		if(cnt == 4) { str = "3��" ; money2 = (long) (money * 0.10);}
		if(cnt == 5) { str = "2��" ; money2 = (long) (money * 0.20);}
		if(cnt == 6) { str = "1��" ; money2 = (long) (money * 0.50);}
		

		//��� ���
		System.out.println();
		System.out.println("��� : " + str );
		
		System.out.println("�� ��÷����: " + money);
		System.out.println("��÷����   : " + money2);
		sc.close();
		 
		
		
			
	}

}
