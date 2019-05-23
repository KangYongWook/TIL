package forwhile;

import java.util.Random;
import java.util.Scanner;

public class forwhile_game4 {

//1. 가위바위보 게임을 구현 한다.

//2. 본인이 게임을 나가려면 "q"를 입력 하면 끝난다.

//3. 게임을 진행 한 회수와 이긴 회수를 출력 한다.

	public static void main(String[] args) {
		int i=0,j=0,k=0,z=0;
		
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		
		for(;;) {
			
			System.out.println("가위 바위 보 게임을 시작합니다. 나가시려면 q를 입력해주세요");
			System.out.println("가위(1) 바위(2) 보(3) 를 입력해주세요");
			
			
		
			
			int num =0;
			Random r = new Random();
			num = r.nextInt(3)+1 ;
			
			if(input < 4 && input > 0) {
			System.out.println("사용자 입력값 : " + input );
			System.out.println("컴퓨터 입력값 : " + num );
			}
			else {
					System.out.println("다른값이 입력되었습니다  다시입력해주세요.");
				
				
			}
			
			if(input < 4 && input > 0) {
				if(input > num) {
					System.out.println("컴퓨터의 승리입니다.");
					j++;
				}
				else if(input == num) {
					System.out.println(" 비겼습니다. ");
					z++;
				}
				else {
					System.out.println("사용자의 승리입니다.");
					k++;
				}
			}
			if(input < 4 && input > 0) {
			i++;
			}
			System.out.println("현재 게임을 진행한 횟수: " + i);
			System.out.println("사용자가  게임을 이긴 횟수: " + k);
			System.out.println("플레이어  게임을 무승부 횟수: " + z);
			System.out.println("컴퓨터가  게임을 이긴 횟수: " + j);
			
			if(input == 'q')
			{
				System.exit(0);
			}
		}
		
	}


}
