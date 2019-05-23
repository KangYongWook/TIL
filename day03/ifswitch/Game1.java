package ifswitch;

import java.util.Random;
import java.util.Scanner;

public class Game1 {
	public static void main(String[] args) {
//		//Random
//		int num = 0;
//		num = (int)(Math.random()* 10)+1;//0.0이상 1.0미만
//		
//		System.out.println(num);
//		
//		// 2. Random
//		Random r = new Random();
//		int num2 = 0;
//		num2 = r.nextInt(3)+1;// 1,2,3, 출력
//		System.out.println(num2);
		
		//1. 사용자는 1~3값을입력 한다.
		//2. 1~3 이외의 문자가 들어오면다시 입력 하라고 한다.
		//3. 컴퓨터는 1~3의 숫자를 랜덤하게 만든다.
		//4. 사용자 숫자와 비교 하여 이겼는지졌는지출력 한다.
		
		
		int num =0;
		Random r = new Random();
		num = r.nextInt(3)+1 ;
		
		System.out.println(" 1~3의 값을 입력하시오");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input < 4 && input > 0) {
		System.out.println("사용자 입력값 : " + input );
		System.out.println("컴퓨터 입력값 : " + num );
		}
		else {
		
		System.out.println(" 다른값이 입력되었습니다  프로그램이 종료됩니다.");
		
		}
		
		if(input < 4 && input > 0) {
			if(input > num) {
				System.out.println("사용자 승리");
			}
			else if(input == num) {
				System.out.println(" 비겼습니다. ");
			}
			else {
				System.out.println("컴퓨터의 승리입니다.");
			}
		}
		
		
		
	}
}
