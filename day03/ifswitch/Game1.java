package ifswitch;

import java.util.Random;
import java.util.Scanner;

public class Game1 {
	public static void main(String[] args) {
//		//Random
//		int num = 0;
//		num = (int)(Math.random()* 10)+1;//0.0�̻� 1.0�̸�
//		
//		System.out.println(num);
//		
//		// 2. Random
//		Random r = new Random();
//		int num2 = 0;
//		num2 = r.nextInt(3)+1;// 1,2,3, ���
//		System.out.println(num2);
		
		//1. ����ڴ� 1~3�����Է� �Ѵ�.
		//2. 1~3 �̿��� ���ڰ� ������ٽ� �Է� �϶�� �Ѵ�.
		//3. ��ǻ�ʹ� 1~3�� ���ڸ� �����ϰ� �����.
		//4. ����� ���ڿ� �� �Ͽ� �̰������������� �Ѵ�.
		
		
		int num =0;
		Random r = new Random();
		num = r.nextInt(3)+1 ;
		
		System.out.println(" 1~3�� ���� �Է��Ͻÿ�");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input < 4 && input > 0) {
		System.out.println("����� �Է°� : " + input );
		System.out.println("��ǻ�� �Է°� : " + num );
		}
		else {
		
		System.out.println(" �ٸ����� �ԷµǾ����ϴ�  ���α׷��� ����˴ϴ�.");
		
		}
		
		if(input < 4 && input > 0) {
			if(input > num) {
				System.out.println("����� �¸�");
			}
			else if(input == num) {
				System.out.println(" �����ϴ�. ");
			}
			else {
				System.out.println("��ǻ���� �¸��Դϴ�.");
			}
		}
		
		
		
	}
}
