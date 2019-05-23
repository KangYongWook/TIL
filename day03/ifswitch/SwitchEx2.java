package ifswitch;

import java.util.Scanner;

public class SwitchEx2 {
	public static void main(String[] args) {
		//String month = "";
		int lastDayOfMonth = 0 ;
		
		System.out.println("현재 월을 입력하시오.");
		Scanner sc = new Scanner(System.in);
	//	int month1 = Integer.parseInt(month);
		int month = sc.nextInt();
		
		// 해당 월의 마지막 일자를 출력 하시오.
		
		switch (month) {
		case 1: 
			lastDayOfMonth = 31;
			break;
		case 2:
			lastDayOfMonth = 28;
			break;
		case 3: 
			lastDayOfMonth = 31;
			break;
		case 4: 
			lastDayOfMonth = 30;
			break;
		case 5: 
			lastDayOfMonth = 31;
			break;
		case 6: 
			lastDayOfMonth = 30;
			break;
		case 7: 
			lastDayOfMonth = 31;
			break;
		case 8: 
			lastDayOfMonth = 31;
			break;
		case 9: 
			lastDayOfMonth = 30;
			break;
		case 10: 
			lastDayOfMonth = 31;
			break;
		case 11: 
			lastDayOfMonth = 30;
			break;
		default :
			lastDayOfMonth = 31;
			break;
		}
			
		System.out.println(lastDayOfMonth);
	}

}
