package day02;

import java.util.Scanner;

public class Operator3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		char c = data.charAt(0); //data�� 0��° ����� char�� �ٲ� 
		
		if( ('a' <= c && c <='z')|| ('A' <= c && c <='B') ) {
			System.out.println("���� �Դϴ�.");
			sc.close();
			return ; //�Լ��� �����ٴ°�
		}
		else {
			System.out.println("���� �Դϴ�.");
		}
		
		c++;
		System.out.println(c);
		sc.close();

	}

}
