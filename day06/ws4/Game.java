package ws4;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// 1턴
//		j += p1num;
//		if (flag == 1 && j <= 7) {
//			
//			p1 -= num[0][j];
//			System.out.printf("플레이어 1 점수 :%d점 입니다.", p1);
//		}
//
//		// 2턴
//
//		else if (flag == 1 && j>7) {
//			i = j - 7;
//			p1 -= num[i][7];
//			System.out.printf("플레이어 1 점수 :%d점 입니다.", p1);
//			flag = 2;
//		}
//		if (flag == 2 && i <= 7) {
//			i += p1num;
//			p1 -= num[i][7];
//			System.out.printf("플레이어 1 점수 :%d점 입니다.", p1);
//		} else if (flag == 2 && i > 7) {
//			k = i - 7;
//			p1 -= num[7][k];
//			System.out.printf("플레이어 1 점수 :%d점 입니다.", p1);
//			flag = 3;
//		}
//
//		if (flag == 3 && k <= 7) {
//			k += p1num;
//			p1 -= num[7][k];
//		} else if (flag == 3 && k > 7) {
//
//			q = k - 7;
//			p1 -= num[q][0];
//			System.out.printf("플레이어 1 점수 :%d점 입니다.", p1);
//			flag = 4;
//		}
//		if (flag == 4 && q <= 7) {
//			q += p1num;
//			p1 -= num[q][0];
//			System.out.printf("플레이어 1 점수 :%d점 입니다.", p1);
//			i = 0;
//		} else if (flag == 4 && q > 7) {
//			j = q - 7;
//			flag = 1;
//		}
		int num[][] = new int[8][8];
		int p1 = 1000;
		int p2 = 1000;
		int p1num = 0;
		int p2num = 0;
		int arr1[] = new int[28];
		int arr2[] = new int[28];

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
		// 판 출력
		for (int temp[] : num) {
			for (int data : temp) {
				System.out.printf("%d\t", data);
			}
			System.out.println();
		}
	}
}