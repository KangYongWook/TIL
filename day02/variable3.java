package day02;

import java.util.Scanner;

public class variable3 {

	public static void main(String[] args) {
		// // 4������ ������ �������Է� �޴´�.
		// �հ�� ����� ���Ͻÿ�
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���������� �Է��Ͻÿ�. ");
		String data = sc.nextLine();
		int num = Integer.parseInt(data);
		
		
		System.out.println("���������� �Է��Ͻÿ�. ");
		String data1 = sc.nextLine();
		int num1 = Integer.parseInt(data1);
		
		
		System.out.println("���������� �Է��Ͻÿ�. ");
		String data2 = sc.nextLine();
		int num2 = Integer.parseInt(data2);
		
		
		System.out.println("���������� �Է��Ͻÿ�. ");
		String data3 = sc.nextLine();
		int num3 = Integer.parseInt(data3);
		
		double sum = num + num1 + num2 + num3 ;
		double avg = sum / 4 ;
		
		System.out.println("�հ�� " + sum + "�Դϴ�");
		System.out.println("��մ� " + avg + "�Դϴ�");
		
		

	}

}
