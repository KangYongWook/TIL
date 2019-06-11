package ws;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String id = "";
		String pw = "";
		String account = "";
		int usermoney = 0;
		int usernumber[] = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("ID를 입력하세요: ");
		id = sc.nextLine();
		System.out.println("PW를 입력하세요: ");
		pw = sc.nextLine();
		System.out.println("계좌를 입력하세요: ");
		account = sc.nextLine();
		System.out.println("입금할 돈을 입력하세요: ");
		usermoney = sc.nextInt();

		User user = new User(id, pw, account, usermoney);

		while (true) {

			System.out.println("ID를 입력하세요: ");
			String id1 = sc.next();

			System.out.println("PW를 입력하세요: ");
			String pw1 = sc.next();
			if (user.UserInfo(id1, pw1) == true) {
				break;
			}
			
		}
		System.out.println("로또번호를 6자리를 입력하세요:");
		for (int i = 0; i < usernumber.length; i++) {
			usernumber[i] = sc.nextInt();
		}
		System.out.println("게임비를 입력하세요:");

		double gamemoney = sc.nextDouble();

		try {
			user.setBalance(user.withdraw(gamemoney));

		} catch (Exception e) {
			System.out.println("잔고가 부족합니다.");
		}

		user.lotto.GenerateNum();
		System.out.println(user.getBalance());
		System.out.println(Arrays.toString(user.lotto.getComNumber()));
		int count = user.lotto.CompareNum(usernumber);
		System.out.println("맞은갯수:" + count);
		double money = user.lotto.Money(gamemoney, count); // count = 당첨 숫자 갯수
		System.out.println("당첨금:" + money);
		user.setBalance(user.deposit(money));
		System.out.println("잔액:" + user.getBalance());
		sc.close();
	}

}
