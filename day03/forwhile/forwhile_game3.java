package forwhile;

import java.util.Scanner;

public class forwhile_game3 {
	// 주사위 두개의 숫자를 입력 받는다.
	// 두 숫자에 해당하는 오늘의 운세를 화면에 출력한다. 
	// 두 숫자에 해당하는 오늘의 운세를 화면에 출력한다.
	public static void main(String[] args) {
		
		int luck , luck1 = 0; 
		String str ="";
		
		System.out.println("오늘의 운세입니다.");
		System.out.println("첫번쨰 숫자를 입력해주세요 (1~6).");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		if(n1 > 6 || n1 <1 ) {
			System.out.println("1 ~ 6 사이의 숫자를 입력 해주세요. 다른숫자 입력시 종료됩니다.");
			n1 = sc.nextInt();
			if(n1 > 6 || n1 <1 ) {
				sc.close();
				return ;
			}
		}
		
		System.out.println("두번쨰 숫자를 입력해주세요 (1~6).");
		int n2 = sc.nextInt();
		if(n2 > 6 || n2 <1 ) {
			System.out.println("1 ~ 6 사이의 숫자를 입력 해주세요.");
			n2 = sc.nextInt();
			if(n2 > 6 || n2 <1 ) {
				sc.close();
				return ;
			}
		}
		luck = n1 - n2 ;
		
		for(int i = 1; i<7; i++) {
			for(int j= 1; j<7 ; j++) {
				
				luck1 = i-j ;
				if(luck1 == -4 || luck1 == -5) 
				{
					System.out.printf("차조심하기\t");
					if(luck == luck1)
					{
						str ="차를 조심하는게 좋을거 같아요!!";
					}
				}
				else if(luck1 == -3 || luck1 == -2) 
				{
					System.out.printf("로또꼭사기\t");
					if(luck == luck1)
					{
						str ="오늘은 운이좋으시네요 로또 사세요!!";
					}
				}
				else if(luck1 == -1 || luck1 == 1)  
				{
					System.out.printf("노에러코딩\t");
					if(luck == luck1)
					{
						str ="오늘은 error 없는 날!!";
					}
				}
				else if(luck1 == 0 )
				{
					System.out.printf("밥빨리먹기\t");
					if(luck == luck1)
					{
						str ="오늘은 밥을 빨리 먹는게 좋을거 같아요!!";
					}
				}
				else if(luck1 == 2 || luck1 == 3)
				{	
					System.out.printf("운이없는날\t");
					if(luck == luck1)
					{
						str ="운이 없으시네요 13% 당첨되셨어요. 어쩌면 운이 좋을걸지도?!!";
					}
				}
				else   
				{	
					System.out.printf("방콕하는날\t");
					if(luck == luck1)
					{
						str ="오늘은 집에만 있는게 좋을것 같아요.!!";
					}
				}		
			}
			System.out.println();
		}
		
		System.out.println("당신의 운세는 : " + str);
		sc.close();		
		
	}
}
