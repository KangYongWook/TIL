package forwhile;

import java.util.Scanner;

public class forwhile_game3 {
	// �ֻ��� �ΰ��� ���ڸ� �Է� �޴´�.
	// �� ���ڿ� �ش��ϴ� ������ ��� ȭ�鿡 ����Ѵ�. 
	// �� ���ڿ� �ش��ϴ� ������ ��� ȭ�鿡 ����Ѵ�.
	public static void main(String[] args) {
		
		int luck , luck1 = 0; 
		String str ="";
		
		System.out.println("������ ��Դϴ�.");
		System.out.println("ù���� ���ڸ� �Է����ּ��� (1~6).");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		if(n1 > 6 || n1 <1 ) {
			System.out.println("1 ~ 6 ������ ���ڸ� �Է� ���ּ���. �ٸ����� �Է½� ����˴ϴ�.");
			n1 = sc.nextInt();
			if(n1 > 6 || n1 <1 ) {
				sc.close();
				return ;
			}
		}
		
		System.out.println("�ι��� ���ڸ� �Է����ּ��� (1~6).");
		int n2 = sc.nextInt();
		if(n2 > 6 || n2 <1 ) {
			System.out.println("1 ~ 6 ������ ���ڸ� �Է� ���ּ���.");
			n2 = sc.nextInt();
			if(n2 > 6 || n2 <1 ) {
				sc.close();
				return ;
			}
		}
		luck = n1 - n2 ;
		
		for(int i = 1; i<7; i++) {
			for(int j= 1; j<7 ; j++) {
				
				luck1 = i-j ;
				if(luck1 == -4 || luck1 == -5) 
				{
					System.out.printf("�������ϱ�\t");
					if(luck == luck1)
					{
						str ="���� �����ϴ°� ������ ���ƿ�!!";
					}
				}
				else if(luck1 == -3 || luck1 == -2) 
				{
					System.out.printf("�ζǲ����\t");
					if(luck == luck1)
					{
						str ="������ ���������ó׿� �ζ� �缼��!!";
					}
				}
				else if(luck1 == -1 || luck1 == 1)  
				{
					System.out.printf("�뿡���ڵ�\t");
					if(luck == luck1)
					{
						str ="������ error ���� ��!!";
					}
				}
				else if(luck1 == 0 )
				{
					System.out.printf("�仡���Ա�\t");
					if(luck == luck1)
					{
						str ="������ ���� ���� �Դ°� ������ ���ƿ�!!";
					}
				}
				else if(luck1 == 2 || luck1 == 3)
				{	
					System.out.printf("���̾��³�\t");
					if(luck == luck1)
					{
						str ="���� �����ó׿� 13% ��÷�Ǽ̾��. ��¼�� ���� ����������?!!";
					}
				}
				else   
				{	
					System.out.printf("�����ϴ³�\t");
					if(luck == luck1)
					{
						str ="������ ������ �ִ°� ������ ���ƿ�.!!";
					}
				}		
			}
			System.out.println();
		}
		
		System.out.println("����� ��� : " + str);
		sc.close();		
		
	}
}
