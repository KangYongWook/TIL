package ws;

import java.util.Arrays;
import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		//문자열 입력 후 char배열에 복사
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하시오.. : ");
		String cmd = sc.nextLine();
		char []c = cmd.toCharArray();
		System.out.println("입력 문자열:"+Arrays.toString(c));
		int length = cmd.length();
		
		
		//대문자+거꾸로
		for(int i =0;i<=length-1-i;i++) {
			char temp = (char)(c[i]-32);
			c[i] = (char)(c[length-1-i]-32);
			c[length-1-i] = temp;
		}
				
		//암호화
		System.out.println("거꾸로 출력,대문자 변환:"+Arrays.toString(c));
		for(int i =0;i<length;i++){
			
			c[i]=(char)(c[i]+5);
		}
		
		System.out.println("암호화  :"+Arrays.toString(c));
		
		
		//복호화
			for(int j=0;j<=length-1-j;j++) {
				char temp = (char)(c[j]+32-5);
				c[j] = (char)(c[length-1-j]+32-5);
				c[length-1-j] = temp;
			}
			String newStr = new String(c);
			System.out.println("초기 입력 문자열: "+newStr);
			

		sc.close();
	}

}
