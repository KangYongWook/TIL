package bank;

import java.util.Scanner;

public class Account {

	Scanner sc = new Scanner(System.in);
	private int money; // -> BALANCE 로 바꿈
	private int accountnum;
	private int password;
	private String name;
	private int balance;

	boolean power;

	Account() {
	}
	Account(int money, int password, int accountnum, boolean power, int balance) {
		this.money = money;
		this.password = password;
		this.accountnum = accountnum;
		this.power = power;
		this.balance = balance;
	}

	// 잔고를 조회
	int getBalance() {
		System.out.println(balance);
		return balance;
	}

	// 비밀번호 변경
	void setPassword(int password) {
		this.password = password;
	}

	// 입금
	int MoneyIn(int money) {
		this.balance += money;
		return this.balance;
	}

	// 출금
	void MoneyOut(int money) {
		if (money > this.balance) {
			System.out.println("잔액이 부족");
			return;
		}
		if (money < 0) {
			System.out.println("0원 미만을 출금 불가");
			return;
		}
		this.balance -= money;
	}

	// 고객 정보 입력
	void createAccount() {
		Scanner scan = new Scanner(System.in);

		System.out.print("계좌번호 : ");
		this.accountnum = scan.nextInt();

		System.out.print("이름 : ");
		this.name = scan.next();

		System.out.print("비밀번호 : ");
		this.password = scan.nextInt();

		System.out.print("금액 : ");
		this.balance = scan.nextInt();

		System.out.println("고객 계좌가 개설되었습니다.");
	}
	// 고객 정보 조회
	void getAccountInfo() {
		System.out.println("계좌번호 :" + accountnum + ", 예금주명 :" + name + ", " + "비밀번호 :" + password + ", 잔고 :" + balance);
	}

	// 계좌번호를 조회하다.
	int getAccountNumber() {
		return accountnum;
	}

	void Certificate(int accountnum, int password) {
		if (this.accountnum != accountnum && this.password != password) {
			System.out.println("계좌 번호와 패스워드 오류");
			return;
		}
	}
	void Power() {
	}
	// 이체
	int Transfer(int money, int accountnum) {
		System.out.println("이체 할 통장의 계좌 번호를 입력 : ");
		accountnum = sc.nextInt();
		if (this.accountnum == accountnum) {
			System.out.println("송금액을 입력");
		} else {
			System.out.println("계좌 번호를 찾을 수 없음");
		}
		this.balance -= money;
		return money;
	}
	void Alarm() {
	}
}
