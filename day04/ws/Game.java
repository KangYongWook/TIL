package ws;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
	// �������
	// 1.���� ������ �Է�
	// 2.�������� ���� ���� ����� .1~100������ �����Է�
	// 3.���ڸ� �Է¹޾Ƽ� �Է� ���� ���� �ִ� ���� 0���� ����
	// 4.���� �Ǹ� ǥ��
	public static void main(String[] args) {
		int row = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϴ� ũ�⸦ �Է��Ͻÿ�.");
		row = sc.nextInt();

		int bingo[][] = new int[row][row];

		Random r = new Random();
		// 1���迭�ȿ� ���� 100�� ����
		int ranNum[] = new int[row * row];
		int bingoCnt = 0;
		// ���ߺ�
		for (int i = 0; i < ranNum.length; i++) {
			ranNum[i] = r.nextInt(100) + 1;
			for (int j = 0; j < i; j++) {
				if (ranNum[i] == ranNum[j]) {
					i--;
					break;
				}
			}
		}

		System.out.println(Arrays.toString(ranNum));
		int k = 0;
		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				bingo[i][j] = ranNum[k];
				k++;
			}
		}
		System.out.println("�������� �����Ǿ����ϴ�.");
		while (true) {
			for (int temp[] : bingo) {
				for (int data : temp) {
					System.out.printf("%d\t", data);
				}
				System.out.println();
			}
			System.out.print("���� �Է�: ");
			int userNum = sc.nextInt();
			out: for (int i = 0; i < bingo.length; i++) {
				for (int j = 0; j < bingo[i].length; j++) {
					if (bingo[i][j] == userNum) {
						bingo[i][j] = 0;
						break out;
					}
				}
			}
			int rowBingo[] = new int[row];
			int colBingo[] = new int[row];
			int diaBingo[] = new int[2];
			for (int i = 0; i < bingo.length; i++) {
				for (int j = 0; j < bingo[i].length; j++) {
					rowBingo[i] += bingo[i][j];
					colBingo[j] += bingo[i][j];
					diaBingo[0] += bingo[i][i];
					diaBingo[1] += bingo[i][row - 1 - i];
				}
			}
			int Bingocnt = 0;
			for (int i = 0; i < bingo.length; i++) {
				if (rowBingo[i] == 0) {
					Bingocnt++;
					rowBingo[i] = 1;
				}
				if (colBingo[i] == 0) {
					Bingocnt++;
					colBingo[i] = 1;
				}
				if (diaBingo[1] == 0) {
					Bingocnt++;
					diaBingo[1] = 1;
				} else if (diaBingo[0] == 0) {
					Bingocnt++;
					diaBingo[0] = 1;
				}
			}
			System.out.println("����: " + Bingocnt);

			if (Bingocnt == 3) {
				System.out.println("�¸�!!!!!!");
				return;
			}
		}

	}
}
