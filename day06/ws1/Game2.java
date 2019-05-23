package ws1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		char a = ' ';  
		char b[][] = new char[9][9]; // 캔디판
		int cnt = 0 ;; // 맞춘거 카운트
		int coordinate = 0 ;
		int coordinate1 = 0 ;
		// 아스키코드로 변환하여 문자넣어줌
		for(int i =0 ; i<9 ; i++) {
			for(int j = 0 ; j < 9 ; j++)
			{
				a = (char)(rd.nextInt(5) + 65);
				b[i][j] = a ;
			}
		}
		System.out.println("게임을 시작합니다. 10개 맞추면 승리!");
		while(true) {
			// 판생성
			for(int i =0 ; i<9 ; i++) {
				for(int j = 0 ; j < 9 ; j++)
				{
					System.out.printf("%s %d %d\t", b[i][j], i , j);
					
				}
				System.out.println();
			}
			
			
		
			// 좌표입력
			System.out.println("교체할 좌표를 첫번째를 입력해주세요.게임 종료시 숫자 100");
			 coordinate = sc.nextInt();
			//게임종료
			if (coordinate == 100) {
				System.out.println("게임종료");
				return ;
				}
			//다른값입력시 
			if(coordinate < 0 || coordinate > 88)
			{
				while(true) {
					System.out.println("다시입력해주세요");
					coordinate = sc.nextInt();
					if(coordinate >= 0 && coordinate <= 88) {
						break;
					}
				}
			}
			System.out.println("교체할 좌표를 두번쨰를 입력해주세요.게임 종료시 숫자 100");
			 coordinate1 = sc.nextInt();
			 // 다른값 일력시
				if(coordinate1 < 0 || coordinate1 > 88)
				{
					while(true) {
						System.out.println("다시입력해주세요");
						coordinate1 = sc.nextInt();
						if(coordinate1 >= 0 && coordinate1 <= 88) {
							break;
						}
					}
				}
						
			// 게임 종료
			if (coordinate1 == 100) {
				System.out.println("게임종료");
				return ;
			}
			// 이웃하는것만 좌표 교체
			if(
			(coordinate == coordinate1-1) ||
			(coordinate == coordinate1+1) ||
			(coordinate == coordinate1-10)||
			(coordinate == coordinate1+10)||
				
			(coordinate1 == coordinate1-1)||
			(coordinate1 == coordinate1+1)||	
			(coordinate1 == coordinate1-10)||
			(coordinate1 == coordinate1+10)
			)
			{
				char temp = b[coordinate/10][coordinate%10];
				b[coordinate/10][coordinate%10] = b[coordinate1/10][coordinate1%10];
				b[coordinate1/10][coordinate1%10] = temp;
			}
			else {
				while(true) {
					System.out.println("이웃하지 않은 좌표입니다. 다시입력해주세요 .");
					System.out.println("교체할 좌표를 첫번째를 입력해주세요.게임 종료시 숫자 100");
					 coordinate = sc.nextInt();
					
					System.out.println("교체할 좌표를 두번쨰를 입력해주세요.게임 종료시 숫자 100");
					 coordinate1 = sc.nextInt();
					 if(
								(coordinate == coordinate1-1) ||
								(coordinate == coordinate1+1) ||
								(coordinate == coordinate1-10)||
								(coordinate == coordinate1+10)||
									
								(coordinate1 == coordinate1-1)||
								(coordinate1 == coordinate1+1)||	
								(coordinate1 == coordinate1-10)||
								(coordinate1 == coordinate1+10)
								) {
						 break;
					 }
						 
					 
				}
			}
			// 3개 가로로 맞으면 소멸 하고 1카운트
			for(int i =0 ; i<9; i++) {
				for(int j =1 ; j<8; j++) {
					if(b[i][j-1] == b[i][j]) {
						if(b[i][j] == b[i][j+1])
						{
							cnt ++ ;
							b[i][j-1]=(char)(rd.nextInt(5)+65);
							b[i][j]=(char)(rd.nextInt(5)+65);;
							b[i][j+1]=(char)(rd.nextInt(5)+65);;																																	
						}
					}
						
					
				}
			
			}
			
			System.out.println(cnt+"개 맞추셨습니다 ");
			if(cnt == 10) {
			System.out.println(cnt+"개 맞추셨습니다  승리하셨습니다. !!");
				return;
			}
		}// while end
		//end
	}

}
