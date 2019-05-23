package day02;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		//2개의 숫자를 받아 들인다
		// a/b를 계산한다.
		// 출력시 소숫점 3자리까지 출력하시오
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째  숫자를 입력하시오.");
		String data = sc.nextLine();
		double Num = Double.parseDouble(data);
		
		System.out.println("두번째  숫자를 입력하시오.");
		String data1 = sc.nextLine();
		double Num1 = Double.parseDouble(data1);
		
		double data2 = Num / Num1 ;
		
		System.out.printf(" a / b 를 계산한 결과값입니다. 소숫점 3자리까지 출력. : %.3f", data2);
		
		sc.close();

	}

}

