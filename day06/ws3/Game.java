package ws3;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		int num[][] = new int[8][8];
		int p1 = 1000;
		int p2 = 1000;
		int p1num = 0;
		int p2num = 0;
	
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = r.nextInt(100) + 1;
			}
		}
		for (int i = 1; i < num.length - 1; i++) {
			for (int j = 1; j < num[i].length - 1; j++) {
				num[i][j] = 0;
			}
		}
		// �� ���
		for (int temp[] : num) {
			for (int data : temp) {
				System.out.printf("%d\t", data);
			}
			System.out.println();
		}
		int i = 0;
		int j = 0;
		int k = 0;
		int q = 0;
		int turn = 0;
		int flag = 1;
		while (true) {
			// �÷��̾� 1 �ֻ���
			System.out.println("�÷��̾� 1 �����Դϴ�.1�� �Է����ּ���.");
			int num1 = sc.nextInt();
			if (num1 == 1) {
				p1num = r.nextInt(6) + 1;
				System.out.printf("%d��/�� ���Խ��ϴ�.", p1num);
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.1�� �Է����ּ���.");
				num1 = sc.nextInt();
				if (num1 == 1) {
					p1num = r.nextInt(6) + 1;
					System.out.printf("%d��/�� ���Խ��ϴ�.", p1num);
				}
			}

//		

			// �÷��̾� 2 �ֻ���
			System.out.println("�÷��̾� 2 �����Դϴ�.2�� �Է����ּ���.");
			int num2 = sc.nextInt();
			if (num2 == 2) {
				p2num = r.nextInt(6) + 1;
				System.out.printf("%d��/�� ���Խ��ϴ�.", p2num);
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.1�� �Է����ּ���.");
				num2 = sc.nextInt();
				if (num2 == 1) {
					p2num = r.nextInt(6) + 1;
					System.out.printf("%d��/�� ���Խ��ϴ�.", p2num);
				}
			}
		}

	}

}
