package forwhile;

import java.util.Random;
import java.util.Scanner;

public class forwhile_game4 {

//1. ���������� ������ ���� �Ѵ�.

//2. ������ ������ �������� "q"�� �Է� �ϸ� ������.

//3. ������ ���� �� ȸ���� �̱� ȸ���� ��� �Ѵ�.

	public static void main(String[] args) {
		int i=0,j=0,k=0,z=0;
		
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		
		for(;;) {
			
			System.out.println("���� ���� �� ������ �����մϴ�. �����÷��� q�� �Է����ּ���");
			System.out.println("����(1) ����(2) ��(3) �� �Է����ּ���");
			
			
		
			
			int num =0;
			Random r = new Random();
			num = r.nextInt(3)+1 ;
			
			if(input < 4 && input > 0) {
			System.out.println("����� �Է°� : " + input );
			System.out.println("��ǻ�� �Է°� : " + num );
			}
			else {
					System.out.println("�ٸ����� �ԷµǾ����ϴ�  �ٽ��Է����ּ���.");
				
				
			}
			
			if(input < 4 && input > 0) {
				if(input > num) {
					System.out.println("��ǻ���� �¸��Դϴ�.");
					j++;
				}
				else if(input == num) {
					System.out.println(" �����ϴ�. ");
					z++;
				}
				else {
					System.out.println("������� �¸��Դϴ�.");
					k++;
				}
			}
			if(input < 4 && input > 0) {
			i++;
			}
			System.out.println("���� ������ ������ Ƚ��: " + i);
			System.out.println("����ڰ�  ������ �̱� Ƚ��: " + k);
			System.out.println("�÷��̾�  ������ ���º� Ƚ��: " + z);
			System.out.println("��ǻ�Ͱ�  ������ �̱� Ƚ��: " + j);
			
			if(input == 'q')
			{
				System.exit(0);
			}
		}
		
	}


}
