package ws1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game3 {
	public static void main(String[] args) {
		
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	int player1 = 1000;
	int player2 = 1000;
	int dice = 0;
	int dicecnt=0, dicecnt1=0, cnt1=0 , cnt2=0 ;
	 
	
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
			
			System.out.println("1�÷��̾� �ֻ����� �����ּ��� Y/N.");
			String input = sc.nextLine();
			System.out.println("�ֻ��� ������ " + dice + " �Դϴ�");
			if(input.equals("Y")) {
				
				dicecnt+=dice; 
				if( dicecnt >=29) {
					dicecnt = dicecnt - 28 ;
				}
				if( dicecnt < 8 ) {
				cnt1= dicecnt;	
				player1 -= a[0][cnt1];
				System.out.println(a[0][cnt1]+" ��ŭ�� ������ �����˴ϴ�.");
				}
				else if ( dicecnt >= 8 && dicecnt <15) {
				cnt1= dicecnt-7;	
				player1 -= a[cnt1][7];
				System.out.println(a[0][cnt1]+" ��ŭ�� ������ �����˴ϴ�.");
				}
				else if( dicecnt >= 15 && dicecnt <22) {
					cnt1= 7-(dicecnt-14);	
					player1 -= a[7][cnt1];
					System.out.println(a[7][cnt1]+" ��ŭ�� ������ �����˴ϴ�.");
				}
				else if( dicecnt >= 22 && dicecnt <29) {
					cnt1= 7-(dicecnt-21);	
					player1 -= a[cnt1][0];
					System.out.println(a[cnt1][0]+" ��ŭ�� ������ �����˴ϴ�.");
				}
				
			}
			System.out.println("1. �÷��̾��� ����Ʈ�� "+ player1 + "�� �Դϴ�.");
		// player2	
			//�ֻ��������  
			dice = rd.nextInt(6)+1;
			
			System.out.println("2�÷��̾� �ֻ����� �����ּ��� Y/N.");
			String input2 = sc.nextLine();
			System.out.println("�ֻ��� ������ " + dice + " �Դϴ�");
			if(input.equals("Y")) {
				
				dicecnt1+=dice; 
				if( dicecnt1 >=29) {
					dicecnt1 = dicecnt1 - 28 ;
				}
				if( dicecnt1 < 8 ) {
				cnt2= dicecnt1;	
				player2 -= a[0][cnt2];
				System.out.println(a[0][cnt2]+" ��ŭ�� ������ �����˴ϴ�.");
				}
				else if ( dicecnt1 >= 8 && dicecnt1 <15) {
				cnt2= dicecnt1-7;	
				player2 -= a[cnt2][7];
				System.out.println(a[0][cnt2]+" ��ŭ�� ������ �����˴ϴ�.");
				}
				else if( dicecnt1 >= 15 && dicecnt1 <22) {
					cnt2= 7-(dicecnt1-14);	
					player2 -= a[7][cnt2];
					System.out.println(a[7][cnt2]+" ��ŭ�� ������ �����˴ϴ�.");
				}
				else if( dicecnt1 >= 22 && dicecnt1 <29) {
					cnt2= 7-(dicecnt1-21);	
					player2 -= a[cnt2][0];
					System.out.println(a[cnt2][0]+" ��ŭ�� ������ �����˴ϴ�.");
				}
				
			}
			
			
			else if(input.equals("N")) {
				return;
			}
			System.out.println("2. �÷��̾��� ����Ʈ�� "+ player2 + "�� �Դϴ�.");
			///////////////////////////////////////////////
		
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
