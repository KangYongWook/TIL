package ws1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
	
//	
//	���ھ߱�
//	1.���� 4�ڸ� ���� �ޱ� (0~9)�ߺ�x
//	2.����ڰ� 4�ڸ� �����Է�
//	3.���ڰ� ������ ball �ڸ��� ������strike
//	4.�ƿ� �ȸ����� out
//	5.������ ��ġ�ϰ� �Ǹ� Ȩ������ ����
	
	
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	int num1[] = new int[4] ; // ��������
	int num[] = new int[4];  // ����� �Է¼���
	int cnt = 0;// �� ��ī��Ʈ
	int cnt1 = 0;// ��Ʈ����ũ ī��Ʈ
	int cnt2 = 0 ; // �� ��ī��Ʈ - ��Ʈ����ũī��Ʈ -> ��ī��Ʈ
	
	System.out.println("�߱� ������ �����մϴ�.");
	// ���ߺ� ���� 4�� ����
	for(int i=0; i<num1.length ; i++) {
		num1[i] = rd.nextInt(9)+1; //1���� ~ 10
		for(int j=0; j<i; j++) {
			if(num1[i] == num1[j]) {
				i--;
			}
		}
	}	
	while(true) {
		cnt=0 ; cnt1 =0; cnt2=0;
		
	// ����� 4�ڸ� �����Է�
	 	System.out.println("4�ڸ����ڸ� �Է����ּ��� . �ߺ�x");
	 	int num2 = sc.nextInt();
	 	
	 	num[0] = num2 /1000;
	 	num[1] = num2 /100%10;
	 	num[2] = num2 /10%10;
	 	num[3] = num2 /1%10;
	 	
	 	if(  (num2/1000) < 1||(num2/1000) >=10)
	 	{
	 		System.out.println("�ٽ� �Է����ּ���.");
	 		num2 = sc.nextInt();
	 		
	 	}
	
	 	
		//����
	
		for(int i = 0; i < num.length ; i++) {
			for(int j =0; j < num.length ; j++) {
				if(num[i] == num1[j])
				{
					cnt++;
					
				}
				
			}
		}
		
		for(int j = 0; j < num.length ; j++) {
			if(num[j] == num1[j])
			{
				cnt1++;
				
				if(cnt1 == 4 ) {
					System.out.println(" Ȩ�� �Դϴ�. �¸� �ϼ̽��ϴ�.");
					return;
				}
			}
		}
		cnt2= cnt-cnt1;
		System.out.println(cnt2+"�� �Դϴ�");
		System.out.println(cnt1+" ��Ʈ����ũ �Դϴ�");
	
	//end
	}
	}

}
