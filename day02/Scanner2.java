package day02;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		//2���� ���ڸ� �޾� ���δ�
		// a/b�� ����Ѵ�.
		// ��½� �Ҽ��� 3�ڸ����� ����Ͻÿ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��°  ���ڸ� �Է��Ͻÿ�.");
		String data = sc.nextLine();
		double Num = Double.parseDouble(data);
		
		System.out.println("�ι�°  ���ڸ� �Է��Ͻÿ�.");
		String data1 = sc.nextLine();
		double Num1 = Double.parseDouble(data1);
		
		double data2 = Num / Num1 ;
		
		System.out.printf(" a / b �� ����� ������Դϴ�. �Ҽ��� 3�ڸ����� ���. : %.3f", data2);
		
		sc.close();

	}

}

