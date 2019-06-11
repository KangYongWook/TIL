package ws;

import java.util.Random;
import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {
		// 1. ���� ������ �Է� 5��
		// 2. �������� ���� ���� ����� 1~100������ ���� �Է�(�ߺ� ����)
		// 3. ���ڸ� �Է� �޾Ƽ� �Է� ���� ���� �ִ� ���� 0���� ����
		// 4. ���� �Ǹ� ǥ��

		Scanner sc = new Scanner(System.in);
		// ���� ������ �Է�
		System.out.println("���� ũ�⸦ ���Ͻÿ� (5X5,6X6.... : ");
		int size = sc.nextInt();

		Random r = new Random();
		int num[][] = new int[size][size];
		int num2[][] = new int[size][size];

		// �ߺ� ���� ���� ����
		int a[] = new int[size * size];
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(100) + 1;
			for (int j = i - 1; j >= 0; j--) {
				if (a[j] == a[i]) {
					a[i] = r.nextInt(100) + 1;
					j = i;
				}
			}
		}

		
		int k = 0;
		// System.out.println(Arrays.toString(a));
		// System.out.println(a.length);

		// ���� �� 2�����迭�� �Է�
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = a[k];
				k++;
			}
		}
		//���� ��
		for (int temp[] : num) {
			for (int data : temp) {
				System.out.printf("%d\t", data);
			}
			System.out.println();
		}
		System.out.println();
		// ������ ���
		for (int temp[] : num2) {
			for (int data : temp) {
				System.out.printf("%d\t", data);
			}
			System.out.println();
		}
		int flag = 0;
		while (true) {
			if (flag == 0) {
				System.out.println("�¾ҽ��ϴ�.����ؼ� ���ڸ� �Է��ϼ���: ");
			}
			int number = sc.nextInt();
			
			// ���� �� �� ���� ���� �Է�
			out: for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < num[i].length; j++) {
					if (num[i][j] == number) {
						num2[i][j] = number;
						flag = 0;
						break out;
					}
					flag = 1;
				}

			}
			if (flag == 1) {
				System.out.println("�´� ���ڰ� �����ϴ�. �ٽ� �Է��ϼ���:");
				continue;
			}
			for (int temp[] : num2) {
				for (int data : temp) {
					System.out.printf("%d\t", data);
				}
				System.out.println();
			}

			// ���� ���� Ȯ��

			int bingo = 0;
			int count = 0;

			for (int i = 0; i < num2.length; i++) {

				for (int j = 0; j < num2[i].length; j++) {
					if (num2[i][j] != 0) {
						count++;
					}

				}
				if (count == size) {

					bingo++;

				}
				count = 0;

			}

			// ���� ���� Ȯ��
			int colsum = 0;
			for (int i = 0; i < num.length; i++) {

				for (int j = 0; j < num[i].length; j++) {
					if (num2[j][i] != 0) {
						colsum++;
					}

				}
				if (colsum == size) {

					bingo++;

				}
				colsum = 0;

			}
			// �밢�� 1 ����
			int x = 0;
			for (int i = 0; i < num2.length; i++) {

				for (int j = 0; j < num2[i].length; j++) {

					if (i == j) {
						if (num2[j][i] != 0) {

							x++;
						}
					}

				}

			}
			if (x == size) {
				bingo++;
				x = 0;
			}

			// �밢�� 2 ����
			int y = 0;
			for (int i = 0; i < num.length; i++) {

				for (int j = 0; j < num[i].length; j++) {

					if (i + j == size - 1) {
						if (num2[i][j] != 0) {
							y++;
						}
					}

				}

			}

			if (y == size) {
				bingo++;
				y = 0;
			}
			

			System.out.printf("%d���� �Դϴ�.", bingo);
			if (bingo >= size) {

				System.out.printf("�̰���ϴ�. ������ �����մϴ�.");
				System.exit(0);

			}
			sc.close();
		}
		
	}
}
