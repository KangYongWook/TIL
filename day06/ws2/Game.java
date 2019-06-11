package ws2;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int candy[][] = new int[9][9];
		char can[][] = new char[9][9];
		int row = 0;
		int col = 0;
		int number = 0;
		int row1 = 0;
		int col1 = 0;
		int tmp = 0;
		int count = 0;
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		// 9X9 �� ����
		for (int i = 0; i < candy.length; i++) {
			for (int j = 0; j < candy[i].length; j++) {
				candy[i][j] = r.nextInt(5);
			}
		}
		// �� ��ȯ �� ���

		for (int i = 0; i < candy.length; i++) {
			for (int j = 0; j < candy[i].length; j++) {
				switch (candy[i][j]) {
				case 0:
					can[i][j] = 'A';
					break;
				case 1:
					can[i][j] = 'B';
					break;
				case 2:
					can[i][j] = 'C';
					break;
				case 3:
					can[i][j] = 'D';
					break;
				case 4:
					can[i][j] = 'E';
					break;

				}
			}
		}
		for (char temp[] : can) {
			for (char data : temp) {
				System.out.printf("%s  ", data);
			}
			System.out.println();
		}

		// ��ǥ ����
		while (true) {

			int ran[] = new int[3];
			for (int i = 0; i < ran.length; i++) {
				ran[i] = r.nextInt(5);
			}
			System.out.println("���ϴ� ��ǥ�� �Է��ϼ���. :");
			row = sc.nextInt();
			col = sc.nextInt();
			System.out.println("�ٲٰ� ���� �̿� ��ǥ������ �����ϼ���. ��(1),��(2),��(3),��(4) :");
			number = sc.nextInt();
			switch(number) {
			case 1:
				row1 = row;
				col1 = col+1;
				break;
			case 2:
				row1 = row;
				col1 = col-1;
				break;
			case 3:
				row1 = row+1;
				col1 = col;
				break;
			case 4:
				row1 = row-1;
				col1 = col;
				break;
				
			}
			
			//�ڸ� �ٲٱ�
			tmp = candy[row][col];
			candy[row][col] = candy[row1][col1];
			candy[row1][col1] = tmp;

			// ���� �̿� �˻�
			for (int i = 0; i < candy.length; i++) {
				for (int j = 0; j < candy[i].length; j++) {
					if (j <= 6 && candy[i][j] == candy[i][j + 1] && candy[i][j + 1] == candy[i][j + 2]) {
						candy[i][j] = ran[0];
						candy[i][j + 1] = ran[1];
						candy[i][j + 2] = ran[2];
						count++;

					}
				}
			}
			
			//��ȯ �� ���
			System.out.println();
			for (int i = 0; i < candy.length; i++) {
				for (int j = 0; j < candy[i].length; j++) {
					switch (candy[i][j]) {
					case 0:
						can[i][j] = 'A';
						break;
					case 1:
						can[i][j] = 'B';
						break;
					case 2:
						can[i][j] = 'C';
						break;
					case 3:
						can[i][j] = 'D';
						break;
					case 4:
						can[i][j] = 'E';
						break;

					}
				}
			}
			for (char temp[] : can) {
				for (char data : temp) {
					System.out.printf("%s  ", data);
				}
				System.out.println();
			}
			System.out.printf("%d�� ����! \n", count);

			if (count >= 10) {
				System.out.println("�����ϼ̽��ϴ�!.");
				sc.close();
				System.exit(0);
			}
		}

	}
}
