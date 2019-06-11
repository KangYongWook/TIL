package ws;


import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// 1. 빙고 사이즈 입력 5행
		// 2. 정방형의 빙고 판을 만들고 1~100까지의 숫자 입력(중복 불허)
		// 3. 숫자를 입력 받아서 입력 받은 값이 있는 곳은 0으로 변경
		// 4. 빙고가 되면 표시

		Scanner sc = new Scanner(System.in);
		// 빙고 사이즈 입력
		System.out.println("빙고 크기를 정하시오 (5X5,6X6.... : ");
		int size = sc.nextInt();

		Random r = new Random();
		int num[][] = new int[size][size];

		
		// 중복 없이 숫자 생성
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

		// 생성 값 2차원배열에 입력
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = a[k];
				k++;
			}
		}

		// 빙고판 출력
		for (int temp[] : num) {
			for (int data : temp) {
				System.out.printf("%d\t", data);
			}
			System.out.println();
		}
		int flag = 0;
		while (true) {
			if (flag == 0) {
				System.out.println("맞았습니다.계속해서 숫자를 입력하세요: ");
			}
			int number = sc.nextInt();
			// 숫자 비교 후 0 입력
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
				System.out.println("맞는 숫자가 없습니다. 다시 입력하세요:");
				continue;
			}
			for (int temp[] : num) {
				for (int data : temp) {
					System.out.printf("%d\t", data);
				}
				System.out.println();
			}

			// 가로 빙고 확인
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

			// 세로 빙고 확인
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
			// 대각선 1 빙고
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
			// 대각선 2 빙고
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

			System.out.printf("%d빙고 입니다.", bingo);
			if(bingo == size) {
			
			System.out.printf("이겼습니다. 게임을 종료합니다.");
			System.exit(0);
		
			}
			sc.close();
		}
	}
}
