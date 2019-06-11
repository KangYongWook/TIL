package ws;


import java.util.Random;
import java.util.Scanner;

public class Game {

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

		// ������ ���
		for (int temp[] : num) {
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
			// ���� �� �� 0 �Է�
			out: for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < num[i].length; j++) {
					if (num[i][j] == number) {
						num[i][j] = 0;
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
			for (int temp[] : num) {
				for (int data : temp) {
					System.out.printf("%d\t", data);
				}
				System.out.println();
			}

			// ���� ���� Ȯ��
			int rowsum = 0;
			int bingo = 0;

			for (int i = 0; i < num.length; i++) {

				for (int j = 0; j < num[i].length; j++) {
					rowsum += num[i][j];

				}
				if (rowsum == 0) {

					bingo++;

				}
				rowsum = 0;

			}

			// ���� ���� Ȯ��
			int colsum = 0;
			for (int i = 0; i < num.length; i++) {

				for (int j = 0; j < num[i].length; j++) {
					colsum += num[j][i];

				}
				if (colsum == 0) {

					bingo++;

				}
				colsum = 0;

			}
			// �밢�� 1 ����
			int x = 0;
			for (int i = 0; i < num.length; i++) {

				for (int j = 0; j < num[i].length; j++) {

					if (i == j) {
						x += num[j][i];
					
					}
				
				}


			}
			if (x == 0) {
				bingo++;
				x = 0;
			}
			// �밢�� 2 ����
			int y = 0;
			for (int i = 0; i < num.length; i++) {

				for (int j = 0; j < num[i].length; j++) {
					
					if (i+j==size-1) {
						
						y += num[i][j];
			
					}
				
				}

			}    
			
			if (y == 0) {
				bingo++;
				
			}
			y = 0;

			System.out.printf("%d���� �Դϴ�.", bingo);
			if(bingo == size) {
			
			System.out.printf("�̰���ϴ�. ������ �����մϴ�.");
			System.exit(0);
		
			}
			sc.close();
		}
	}
}
