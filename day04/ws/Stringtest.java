package ws;

import java.util.Arrays;
import java.util.Scanner;

public class Stringtest {
	
	public static void main(String[] args) {
		
 // 1.�ҹ��ڷε� ���ڿ��� �Է� �޾� ����Ѵ�.
	System.out.println("�ҹ��ڿ��� �Է����ּ���.");
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();	
	System.out.println("�Է¹��� �ҹ��ڿ� ��� : " + input);
//2.�Է� ���� ���ڿ��� �빮�ڷ� ����� ������ ���ٷ� �Ͽ� ����Ѵ�.
	// �빮�ڸ����
	char c1[] = new char[input.length()];
	char c2[] = new char[input.length()];
	
	for(int i= 0 ; i< input.length() ; i++)
	{
		 c1[i] = (char)(input.charAt(i)-32);
		 
	}
	//������
	for(int i=0; i<input.length() ; i++) {
		c2[i] = c1[i];
	}
		
	for(int i=0; i<input.length(); i++) {
		
		c1[i] = c2[input.length()-1-i];
	}
	
	System.out.println("�Է¹��� �ҹ��ڿ��� �빮�ڷιٲٰ� ������ : " + Arrays.toString(c1));
	System.out.println(input.length());
	
	
	
//	3.2������ ������� ���ڿ��� �� char�� +5�� �Ͽ���ȣȭ �Ͽ�����Ѵ�.
	for(int i= 0 ; i< input.length() ; i++)
	{
		// c1[i] = (char)(input.charAt(i)-32+5);
		 c1[i] =(char) (c1[i] +5 );
	}
	System.out.println("��ȣȭ"+Arrays.toString(c1));
	
	
// 4.3������ ������� ���ڿ��� ��ȣȭ �Ͽ����� �Է� ���� ���ڿ�������Ѵ�. 
	
	for(int i=0; i< input.length(); i++) {
		c1[i] = (char)(c2[i]+32);
		
	}
	System.out.println("��ȣȭ"+Arrays.toString(c1));
	sc.close();
	}
	
}
