package ws1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
	
//	
//	숫자야구
//	1.랜덤 4자리 숫자 받기 (0~9)중복x
//	2.사용자가 4자리 숫자입력
//	3.숫자가 있으면 ball 자리도 같으면strike
//	4.아예 안맞으면 out
//	5.완전히 일치하게 되면 홈런으로 게임
	
	
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	int num1[] = new int[4] ; // 랜덤숫자
	int num[] = new int[4];  // 사용자 입력숫자
	int cnt = 0;// 총 볼카운트
	int cnt1 = 0;// 스트라이크 카운트
	int cnt2 = 0 ; // 총 볼카운트 - 스트라이크카운트 -> 볼카운트
	
	System.out.println("야구 게임을 시작합니다.");
	// 노중복 숫자 4개 생성
	for(int i=0; i<num1.length ; i++) {
		num1[i] = rd.nextInt(9)+1; //1에서 ~ 10
		for(int j=0; j<i; j++) {
			if(num1[i] == num1[j]) {
				i--;
			}
		}
	}	
	while(true) {
		cnt=0 ; cnt1 =0; cnt2=0;
		
	// 사용자 4자리 숫자입력
	 	System.out.println("4자리숫자를 입력해주세요 . 중복x");
	 	int num2 = sc.nextInt();
	 	
	 	num[0] = num2 /1000;
	 	num[1] = num2 /100%10;
	 	num[2] = num2 /10%10;
	 	num[3] = num2 /1%10;
	 	
	 	if(  (num2/1000) < 1||(num2/1000) >=10)
	 	{
	 		System.out.println("다시 입력해주세요.");
	 		num2 = sc.nextInt();
	 		
	 	}
	
	 	
		//조건
	
		for(int i = 0; i < num.length ; i++) {
			for(int j =0; j < num.length ; j++) {
				if(num[i] == num1[j])
				{
					cnt++;
					
				}
				
			}
		}
		
		for(int j = 0; j < num.length ; j++) {
			if(num[j] == num1[j])
			{
				cnt1++;
				
				if(cnt1 == 4 ) {
					System.out.println(" 홈런 입니다. 승리 하셨습니다.");
					return;
				}
			}
		}
		cnt2= cnt-cnt1;
		System.out.println(cnt2+"볼 입니다");
		System.out.println(cnt1+" 스트라이크 입니다");
	
	//end
	}
	}

}
