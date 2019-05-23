package day02;

import java.util.Scanner;

public class variable3 {

	public static void main(String[] args) {
		// // 4과목의 점수를 정수로입력 받는다.
		// 합계와 평균을 구하시오
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하시오. ");
		String data = sc.nextLine();
		int num = Integer.parseInt(data);
		
		
		System.out.println("수학점수를 입력하시오. ");
		String data1 = sc.nextLine();
		int num1 = Integer.parseInt(data1);
		
		
		System.out.println("영어점수를 입력하시오. ");
		String data2 = sc.nextLine();
		int num2 = Integer.parseInt(data2);
		
		
		System.out.println("과학점수를 입력하시오. ");
		String data3 = sc.nextLine();
		int num3 = Integer.parseInt(data3);
		
		double sum = num + num1 + num2 + num3 ;
		double avg = sum / 4 ;
		
		System.out.println("합계는 " + sum + "입니다");
		System.out.println("평균는 " + avg + "입니다");
		
		

	}

}
