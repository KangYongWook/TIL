package ifswitch;

import java.util.Scanner;

public class SwitchEx1 {
	public static void main(String[] args) {
		
		// admin Permission Control
		
		int a = 0; //int , String , char
		String input = "" ;
		String str = "";
		
		System.out.println("Admin mode를 입력하시오 . 1.super 2. Middle 3. basic");
		Scanner sc = new Scanner(System.in);
		
		 input = sc.nextLine();
		
		switch(input) {
		case "1" : str += " Super Admin \n";
		
		case "2" : str += " Middle Admin \n";
		
		case "3" : str += " Admin \n";
		
		break;
		case "4" : str = "4등";
		break;
		
		default : str = "FAIL";
		break;
		}
		System.out.println(str);
	}

}
