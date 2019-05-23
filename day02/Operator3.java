package day02;

import java.util.Scanner;

public class Operator3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		char c = data.charAt(0); //data의 0번째 끄집어서 char로 바꿈 
		
		if( ('a' <= c && c <='z')|| ('A' <= c && c <='B') ) {
			System.out.println("문자 입니다.");
			sc.close();
			return ; //함수가 끝난다는것
		}
		else {
			System.out.println("숫자 입니다.");
		}
		
		c++;
		System.out.println(c);
		sc.close();

	}

}
