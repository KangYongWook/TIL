package day02;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in) ;
		System.out.println("Input Number..?");
		String data = sc.nextLine();// 문자열
		int intNum = Integer.parseInt(data);//문자열을 숫자로바꾸는것
		System.out.println(intNum * 100);
		sc.close();
	}

}
