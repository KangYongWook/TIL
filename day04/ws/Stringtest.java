package ws;

import java.util.Arrays;
import java.util.Scanner;

public class Stringtest {
	
	public static void main(String[] args) {
		
 // 1.소문자로된 문자열을 입력 받아 출력한다.
	System.out.println("소문자열을 입력해주세요.");
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();	
	System.out.println("입력받은 소문자열 출력 : " + input);
//2.입력 받은 문자열을 대문자로 만들어 순서를 꺼꾸로 하여 출력한다.
	// 대문자만들기
	char c1[] = new char[input.length()];
	char c2[] = new char[input.length()];
	
	for(int i= 0 ; i< input.length() ; i++)
	{
		 c1[i] = (char)(input.charAt(i)-32);
		 
	}
	//리버스
	for(int i=0; i<input.length() ; i++) {
		c2[i] = c1[i];
	}
		
	for(int i=0; i<input.length(); i++) {
		
		c1[i] = c2[input.length()-1-i];
	}
	
	System.out.println("입력받은 소문자열을 대문자로바꾸고 리버스 : " + Arrays.toString(c1));
	System.out.println(input.length());
	
	
	
//	3.2번에서 만들어진 문자열의 각 char에 +5를 하여암호화 하여출력한다.
	for(int i= 0 ; i< input.length() ; i++)
	{
		// c1[i] = (char)(input.charAt(i)-32+5);
		 c1[i] =(char) (c1[i] +5 );
	}
	System.out.println("암호화"+Arrays.toString(c1));
	
	
// 4.3번에서 만들어진 문자열을 복호화 하여최초 입력 받은 문자열을출력한다. 
	
	for(int i=0; i< input.length(); i++) {
		c1[i] = (char)(c2[i]+32);
		
	}
	System.out.println("복호화"+Arrays.toString(c1));
	sc.close();
	}
	
}
