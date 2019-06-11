package ws;

import java.util.Random;

public class Lotto {
	public static int cnt;
	private int comNumber[];
	Random r = new Random();

	public Lotto() {
		this.comNumber = new int[6];
	}
	
	
 //로또 번호 추첨
	
	public int[] getComNumber() {
		return comNumber;
	}


	public void GenerateNum() {

		for (int i = 0; i < comNumber.length; i++) {
			comNumber[i] = r.nextInt(10) + 1;
			for (int j = i - 1; j >= 0; j--) {
				if (comNumber[j] == comNumber[i]) {
					comNumber[i] = r.nextInt(10) + 1;
					j = i;
				}

			}
		}

	}
// 당첨 번호 확인
	public int CompareNum(int user[]) {
		int count = 0;
		for (int j = 0; j < user.length; j++) {
			for (int c = 0; c < comNumber.length; c++) {
				if (user[j] == comNumber[c]) {
					count++;
				}
			}

		}
		return count;
	}
//당첨금 확인
	public double Money(double gamemoney, int compare) {
		double gold = 0.0;
		switch(compare) {
		case 3:	
			cnt = 4;
			gold = gamemoney * 1;
			break;
		case 4:	
			cnt = 3;
			gold = gamemoney * 10;
			break;
		case 5:	
			cnt = 2;
			gold = gamemoney * 100;
			break;
		case 6:	
			cnt = 1;
			gold = gamemoney * 1000;
			break;
		default:	
		}
		return gold;
	}
}
