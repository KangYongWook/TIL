package ws1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game4 {
	public static void main(String[] args) {
		
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	int player1 = 5000; // ����Ʈ
	int player2 = 5000; //����Ʈ
	int dice = 0; //�ֻ���
	int dicecnt=0, dicecnt1=0, cnt1=0 , cnt2=0 ; // �ֻ��� ��ī��Ʈ �� ���μ��� ī��Ʈ
	int b[] = new int[28]; //������
	
	// ������� �����
	int  a[][] = new int[8][8];
	
	for(int i=0; i<8 ; i++)
	{
		for(int j=0; j<8; j++) {
			
			a[i][j]= rd.nextInt(100)+1; 
			
		}
		
	}
	
	
	// ��� 0�����
	for(int i=1; i<7; i++) {
		for(int j=1; j<7 ; j++) {
			a[i][j]=0;
		}
			
	}
	while(true) {
		// ������� ����Ʈ 
		for(int i=0; i<8 ; i++)
		{
			for(int j=0; j<8; j++) {
				if(a[i][j] == 0)
				{
					System.out.print("        ");
				}
				else {
				System.out.printf("%d \t" ,a[i][j]);
				}
			}
			System.out.println();
		}
		
		
		//���� player1
		//�ֻ��������  
			dice = rd.nextInt(6)+1;
			dicecnt+=dice;
			
			if( dicecnt >=29) {
				dicecnt = dicecnt - 28 ;
			}
			
			String input1 = "";
			System.out.println("1�÷��̾� �ֻ����� �����ּ��� Y/N.");
			String input = sc.nextLine();
			
			
			
			if(input.equals("Y")) {
					
				if( dicecnt < 8 ) {
				cnt1= dicecnt;	
				
					if(b[dicecnt] == 2) {
						player1 -= a[0][cnt1]*2;
						System.out.println("�÷��̾�2���Դϴ�."+a[0][cnt1]*2+" ��ŭ ����Ʈ�� �����˴ϴ�.");
					}
				System.out.println(a[0][cnt1]+" �� ������ġ�Դϴ�.");
				}
				else if ( dicecnt >= 8 && dicecnt <15) {
					cnt1= dicecnt-7;	
					if(b[dicecnt] == 2) {
						player1 -= a[cnt1][7]*2;
						System.out.println("�÷��̾�2���Դϴ�."+a[0][cnt1]*2+" ��ŭ ����Ʈ�� �����˴ϴ�.");
					}
				System.out.println(a[0][cnt1]+" �� ������ġ�Դϴ�.");
				}
				else if( dicecnt >= 15 && dicecnt <22) {
					cnt1= 7-(dicecnt-14);	
					if(b[dicecnt] == 2) {
						player1 -= a[7][cnt1]*2;
						System.out.println("�÷��̾�2���Դϴ�."+a[0][cnt1]*2+" ��ŭ ����Ʈ�� �����˴ϴ�.");
					}
					System.out.println(a[7][cnt1]+" �� ������ġ�Դϴ�.");
				}
				else if( dicecnt >= 22 && dicecnt <29) {
					cnt1= 7-(dicecnt-21);	
					if(b[dicecnt] == 2) {
						player1 -= a[cnt1][0]*2;
						System.out.println("�÷��̾�2���Դϴ�."+a[cnt1][0]*2+" ��ŭ ����Ʈ�� �����˴ϴ�.");
					}
					System.out.println(a[cnt1][0]+" �� ������ġ�Դϴ�.");
				}
				
			}
			else if(input.equals("N")) {
				System.exit(1);
			}
			else {
				System.exit(1);
			}
			System.out.println("�ֻ��� ������ " + dice + " �Դϴ�");
			//�����
			if(b[dicecnt] == 0) {
				System.out.println("���� ��ðڽ��ϱ�?Y1/N1");
				input1 = sc.nextLine();
			}
			if(input1.equals("Y1")) {
				b[dicecnt] =1 ;
				
				if( dicecnt < 8 ) {
					player1 -= a[0][cnt1];
					System.out.println("���� ��̽��ϴ�.");
					System.out.println(a[0][cnt1]+" ��ŭ ������ �����˴ϴ�.");
					}
				else if ( dicecnt >= 8 && dicecnt <15) {
					
					player1 -= a[cnt1][7];
					System.out.println("���� ��̽��ϴ�.");
					System.out.println(a[0][cnt1]+" ��ŭ ������ �����˴ϴ�.");
					}
				else if( dicecnt >= 15 && dicecnt <22) {
						
					player1 -= a[7][cnt1];
					System.out.println("���� ��̽��ϴ�.");
					System.out.println(a[0][cnt1]+" ��ŭ ������ �����˴ϴ�.");
					}
				else if( dicecnt >= 22 && dicecnt <29) {
						
					player1 -= a[cnt1][0];
					System.out.println("���� ��̽��ϴ�.");
					System.out.println(a[0][cnt1]+" ��ŭ ������ �����˴ϴ�.");
					}
			}
			System.out.println("1. �÷��̾��� ����Ʈ�� "+ player1 + "�� �Դϴ�.");
			if(input1.equals("N1")) {
				System.out.println("����մϴ�.");
			}
		// player2	
			//�ֻ��������  
			dice = rd.nextInt(6)+1;
			dicecnt1+=dice; 
			if( dicecnt1 >=29) {
				dicecnt1 = dicecnt1 - 28 ;
			}
			String input3 = " ";
			System.out.println("2�÷��̾� �ֻ����� �����ּ��� Y/N.");
			String input2 = sc.nextLine();
			
			
			if(input2.equals("Y")) {
				
				
				if( dicecnt1 < 8 ) {
				cnt2= dicecnt1;	
				if(b[dicecnt1] == 1) {
					player2 -= a[0][cnt2]*2;
					System.out.println("�÷��̾�1���Դϴ�."+a[0][cnt2]*2+" ��ŭ ����Ʈ�� �����˴ϴ�.");
				}
				System.out.println(a[0][cnt2]+" �� ������ġ�Դϴ�.");
				}
				else if ( dicecnt1 >= 8 && dicecnt1 <15) {
					cnt2= dicecnt1-7;	
					if(b[dicecnt1] == 1) {
						player2 -= a[cnt2][7]*2;
						System.out.println("�÷��̾�1���Դϴ�."+a[0][cnt2]*2+" ��ŭ ����Ʈ�� �����˴ϴ�.");
					}
					System.out.println(a[0][cnt2]+" �� ������ġ�Դϴ�.");
				}
				else if( dicecnt1 >= 15 && dicecnt1 <22) {
					cnt2= 7-(dicecnt1-14);	
					if(b[dicecnt1] == 1) {
						player2 -= a[7][cnt2]*2;
						System.out.println("�÷��̾�1���Դϴ�."+a[0][cnt2]*2+" ��ŭ ����Ʈ�� �����˴ϴ�.");
					}
					System.out.println(a[7][cnt2]+" �� ������ġ�Դϴ�.");
				}
				else if( dicecnt1 >= 22 && dicecnt1 <29) {
					cnt2= 7-(dicecnt1-21);	
					if(b[dicecnt1] == 1) {
						player2 -= a[cnt2][0]*2;
						System.out.println("�÷��̾�1���Դϴ�."+a[0][cnt2]*2+" ��ŭ ����Ʈ�� �����˴ϴ�.");
					}
					System.out.println(a[cnt2][0]+" �� ������ġ�Դϴ�.");
				}
				
			}
			else if(input2.equals("N")) {
				return;
			}
			else {
				return;
			}
			System.out.println("�ֻ��� ������ " + dice + " �Դϴ�");
			//�����
			if(b[dicecnt1] == 0) {
				System.out.println("���� ��ðڽ��ϱ�?Y1/N1");
				input3 = sc.nextLine();
			}
			if(input3.equals("Y1")) {
				b[dicecnt] =2 ;
				if( dicecnt1 < 8 ) {
						
					player2 -= a[0][cnt2];
					System.out.println("���� ��̽��ϴ�.");
					System.out.println(a[0][cnt2]+" ��ŭ ������ �����˴ϴ�.");
					}
				else if ( dicecnt1 >= 8 && dicecnt1 <15) {
					
					player2 -= a[cnt2][7];
					System.out.println("���� ��̽��ϴ�.");
					System.out.println(a[0][cnt2]+" ��ŭ ������ �����˴ϴ�.");
					}
				else if( dicecnt1 >= 15 && dicecnt1 <22) {
						
					player2 -= a[7][cnt2];
					System.out.println("���� ��̽��ϴ�.");
					System.out.println(a[0][cnt2]+" ��ŭ ������ �����˴ϴ�.");
					}
				else if( dicecnt1 >= 22 && dicecnt1 <29) {
						
					player2 -= a[cnt2][0];
					System.out.println("���� ��̽��ϴ�.");
					System.out.println(a[0][cnt2]+" ��ŭ ������ �����˴ϴ�.");
					}
			}
			System.out.println("2. �÷��̾��� ����Ʈ�� "+ player2 + "�� �Դϴ�.");
			if(input1.equals("N1")) {
				System.out.println("����մϴ�.");
			}
			
			///////////////////////////////////////////////////////////////////
		
		if(player1 < 0) {
			System.out.println("1. �÷��̾��� �����̴޷� �й��Դϴ�. ������ ����˴ϴ�.");
			return;
		}
		if(player2 < 0) {
			System.out.println("2. �÷��̾��� �����̴޷� �й��Դϴ�. ������ ����˴ϴ�.");
			return;
		}
		
	}
	
	}
}
