package day02;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in) ;
		System.out.println("Input Number..?");
		String data = sc.nextLine();// ���ڿ�
		int intNum = Integer.parseInt(data);//���ڿ��� ���ڷιٲٴ°�
		System.out.println(intNum * 100);
		sc.close();
	}

}
