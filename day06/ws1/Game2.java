package ws1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		char a = ' ';  
		char b[][] = new char[9][9]; // ĵ����
		int cnt = 0 ;; // ����� ī��Ʈ
		int coordinate = 0 ;
		int coordinate1 = 0 ;
		// �ƽ�Ű�ڵ�� ��ȯ�Ͽ� ���ڳ־���
		for(int i =0 ; i<9 ; i++) {
			for(int j = 0 ; j < 9 ; j++)
			{
				a = (char)(rd.nextInt(5) + 65);
				b[i][j] = a ;
			}
		}
		System.out.println("������ �����մϴ�. 10�� ���߸� �¸�!");
		while(true) {
			// �ǻ���
			for(int i =0 ; i<9 ; i++) {
				for(int j = 0 ; j < 9 ; j++)
				{
					System.out.printf("%s %d %d\t", b[i][j], i , j);
					
				}
				System.out.println();
			}
			
			
		
			// ��ǥ�Է�
			System.out.println("��ü�� ��ǥ�� ù��°�� �Է����ּ���.���� ����� ���� 100");
			 coordinate = sc.nextInt();
			//��������
			if (coordinate == 100) {
				System.out.println("��������");
				return ;
				}
			//�ٸ����Է½� 
			if(coordinate < 0 || coordinate > 88)
			{
				while(true) {
					System.out.println("�ٽ��Է����ּ���");
					coordinate = sc.nextInt();
					if(coordinate >= 0 && coordinate <= 88) {
						break;
					}
				}
			}
			System.out.println("��ü�� ��ǥ�� �ι����� �Է����ּ���.���� ����� ���� 100");
			 coordinate1 = sc.nextInt();
			 // �ٸ��� �Ϸ½�
				if(coordinate1 < 0 || coordinate1 > 88)
				{
					while(true) {
						System.out.println("�ٽ��Է����ּ���");
						coordinate1 = sc.nextInt();
						if(coordinate1 >= 0 && coordinate1 <= 88) {
							break;
						}
					}
				}
						
			// ���� ����
			if (coordinate1 == 100) {
				System.out.println("��������");
				return ;
			}
			// �̿��ϴ°͸� ��ǥ ��ü
			if(
			(coordinate == coordinate1-1) ||
			(coordinate == coordinate1+1) ||
			(coordinate == coordinate1-10)||
			(coordinate == coordinate1+10)||
				
			(coordinate1 == coordinate1-1)||
			(coordinate1 == coordinate1+1)||	
			(coordinate1 == coordinate1-10)||
			(coordinate1 == coordinate1+10)
			)
			{
				char temp = b[coordinate/10][coordinate%10];
				b[coordinate/10][coordinate%10] = b[coordinate1/10][coordinate1%10];
				b[coordinate1/10][coordinate1%10] = temp;
			}
			else {
				while(true) {
					System.out.println("�̿����� ���� ��ǥ�Դϴ�. �ٽ��Է����ּ��� .");
					System.out.println("��ü�� ��ǥ�� ù��°�� �Է����ּ���.���� ����� ���� 100");
					 coordinate = sc.nextInt();
					
					System.out.println("��ü�� ��ǥ�� �ι����� �Է����ּ���.���� ����� ���� 100");
					 coordinate1 = sc.nextInt();
					 if(
								(coordinate == coordinate1-1) ||
								(coordinate == coordinate1+1) ||
								(coordinate == coordinate1-10)||
								(coordinate == coordinate1+10)||
									
								(coordinate1 == coordinate1-1)||
								(coordinate1 == coordinate1+1)||	
								(coordinate1 == coordinate1-10)||
								(coordinate1 == coordinate1+10)
								) {
						 break;
					 }
						 
					 
				}
			}
			// 3�� ���η� ������ �Ҹ� �ϰ� 1ī��Ʈ
			for(int i =0 ; i<9; i++) {
				for(int j =1 ; j<8; j++) {
					if(b[i][j-1] == b[i][j]) {
						if(b[i][j] == b[i][j+1])
						{
							cnt ++ ;
							b[i][j-1]=(char)(rd.nextInt(5)+65);
							b[i][j]=(char)(rd.nextInt(5)+65);;
							b[i][j+1]=(char)(rd.nextInt(5)+65);;																																	
						}
					}
						
					
				}
			
			}
			
			System.out.println(cnt+"�� ���߼̽��ϴ� ");
			if(cnt == 10) {
			System.out.println(cnt+"�� ���߼̽��ϴ�  �¸��ϼ̽��ϴ�. !!");
				return;
			}
		}// while end
		//end
	}

}
