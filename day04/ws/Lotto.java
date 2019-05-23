package ws;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
			/*1.6개의 숫자 입력 (범위: 1~10)
			2.그 날의 당첨번호 6개 생성(범위 : 1~10) 중복되지 않는 숫자 생성
			3.당첨금 생성 (범위: 10억~100억)
			4.입력 받은 숫자와 당첨번호 확인
			-3개 맞으면 : 4등 (당첨금 5%)
			-4개 맞으면 : 3등 (당첨금 10%)
			-5개 맞으면 : 2등 (당첨금 20%)
			-6개 맞으면 : 1등 (당첨금 50%)*/
		
		Scanner sc = new Scanner(System.in); // 입력받음
		Random rd = new Random();   // 당첨번호 생성 및 금액생성
		String str = "";
		
		int a[] = new int[6]; // 당첨번호 배열
		int b[] = new int[6]; // 로또번호 배열
		long money = 0 ; //총 당첨 금액
		long money2 = 0;  // 당첨금액
		int cnt = 0 ; 	
		money = (rd.nextInt(900000000) + 100000000 ) * 10L; //10억~100억
		//숫자입력 
		System.out.println("6개의 숫자를 입력하시오 범위 : 1~10 ");
		
		// 숫자입력
		for(int i=0; i<6; i++) {
			a[i] = sc.nextInt();	
			
			if(a[i] > 10 || a[i] < 0) {
				System.out.println("다른 값이입력되었습니다. 프로그램 종료");
				return;
			}
		}
		
		// 중복되지않는 당첨번호
		for(int i=0; i<b.length ; i++) {
			b[i] = rd.nextInt(9)+1; //1에서 ~ 10
			for(int j=0; j<i; j++) {
				if(b[i] == b[j]) {
					i--;
				}
			}
		}
		// 내번호와 로또번호 중복 번호  check
		for (int i= 0 ; i < 6;i++) {	
			for(int j=0 ; j <6 ; j++) {	
			if(a[i] == b[j]) 
				cnt ++;
			}
		}
		
		
		System.out.printf("내 번호\t:");
		for(int i=0; i<6; i++) {
			System.out.printf("  "+ a[i]);
		}
		System.out.println();
		System.out.printf("로또 번호\t:");
		for(int i=0; i<6; i++) {
			System.out.printf("  "+ b[i]);
		}
		
	
		
		if(cnt == 3) { str = "4등" ; money2 = (long) (money * 0.05); }
		if(cnt == 4) { str = "3등" ; money2 = (long) (money * 0.10);}
		if(cnt == 5) { str = "2등" ; money2 = (long) (money * 0.20);}
		if(cnt == 6) { str = "1등" ; money2 = (long) (money * 0.50);}
		

		//결과 출력
		System.out.println();
		System.out.println("등수 : " + str );
		
		System.out.println("총 당첨금은: " + money);
		System.out.println("당첨금은   : " + money2);
		sc.close();
		 
		
		
			
	}

}
