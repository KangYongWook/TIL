package ws;

import java.util.Arrays;
import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		//���ڿ� �Է� �� char�迭�� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��Ͻÿ�.. : ");
		String cmd = sc.nextLine();
		char []c = cmd.toCharArray();
		System.out.println("�Է� ���ڿ�:"+Arrays.toString(c));
		int length = cmd.length();
		
		
		//�빮��+�Ųٷ�
		for(int i =0;i<=length-1-i;i++) {
			char temp = (char)(c[i]-32);
			c[i] = (char)(c[length-1-i]-32);
			c[length-1-i] = temp;
		}
				
		//��ȣȭ
		System.out.println("�Ųٷ� ���,�빮�� ��ȯ:"+Arrays.toString(c));
		for(int i =0;i<length;i++){
			
			c[i]=(char)(c[i]+5);
		}
		
		System.out.println("��ȣȭ  :"+Arrays.toString(c));
		
		
		//��ȣȭ
			for(int j=0;j<=length-1-j;j++) {
				char temp = (char)(c[j]+32-5);
				c[j] = (char)(c[length-1-j]+32-5);
				c[length-1-j] = temp;
			}
			String newStr = new String(c);
			System.out.println("�ʱ� �Է� ���ڿ�: "+newStr);
			

		sc.close();
	}

}
