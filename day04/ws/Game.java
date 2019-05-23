package ws;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
	// 빙고게임
	// 1.빙고 사이즈 입력
	// 2.정방형의 빙고 판을 만들고 .1~100까지의 숫자입력
	// 3.숫자를 입력받아서 입력 받은 값이 있는 곳은 0으로 변경
	// 4.빙고가 되면 표시
	public static void main(String[] args) {
		int row = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 크기를 입력하시오.");
		row = sc.nextInt();

		int bingo[][] = new int[row][row];

		Random r = new Random();
		// 1차배열안에 난수 100개 생성
		int ranNum[] = new int[row * row];
		int bingoCnt = 0;
		// 노중복
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
		System.out.println("빙고판이 생성되었습니다.");
		while (true) {
			for (int temp[] : bingo) {
				for (int data : temp) {
					System.out.printf("%d\t", data);
				}
				System.out.println();
			}
			System.out.print("숫자 입력: ");
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
			System.out.println("빙고: " + Bingocnt);

			if (Bingocnt == 3) {
				System.out.println("승리!!!!!!");
				return;
			}
		}

	}
}
