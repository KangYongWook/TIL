package bank;

import java.util.Scanner;

public class Account {

	Scanner sc = new Scanner(System.in);
	private int money; // -> BALANCE �� �ٲ�
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

	// �ܰ� ��ȸ
	int getBalance() {
		System.out.println(balance);
		return balance;
	}

	// ��й�ȣ ����
	void setPassword(int password) {
		this.password = password;
	}

	// �Ա�
	int MoneyIn(int money) {
		this.balance += money;
		return this.balance;
	}

	// ���
	void MoneyOut(int money) {
		if (money > this.balance) {
			System.out.println("�ܾ��� ����");
			return;
		}
		if (money < 0) {
			System.out.println("0�� �̸��� ��� �Ұ�");
			return;
		}
		this.balance -= money;
	}

	// �� ���� �Է�
	void createAccount() {
		Scanner scan = new Scanner(System.in);

		System.out.print("���¹�ȣ : ");
		this.accountnum = scan.nextInt();

		System.out.print("�̸� : ");
		this.name = scan.next();

		System.out.print("��й�ȣ : ");
		this.password = scan.nextInt();

		System.out.print("�ݾ� : ");
		this.balance = scan.nextInt();

		System.out.println("�� ���°� �����Ǿ����ϴ�.");
	}
	// �� ���� ��ȸ
	void getAccountInfo() {
		System.out.println("���¹�ȣ :" + accountnum + ", �����ָ� :" + name + ", " + "��й�ȣ :" + password + ", �ܰ� :" + balance);
	}

	// ���¹�ȣ�� ��ȸ�ϴ�.
	int getAccountNumber() {
		return accountnum;
	}

	void Certificate(int accountnum, int password) {
		if (this.accountnum != accountnum && this.password != password) {
			System.out.println("���� ��ȣ�� �н����� ����");
			return;
		}
	}
	void Power() {
	}
	// ��ü
	int Transfer(int money, int accountnum) {
		System.out.println("��ü �� ������ ���� ��ȣ�� �Է� : ");
		accountnum = sc.nextInt();
		if (this.accountnum == accountnum) {
			System.out.println("�۱ݾ��� �Է�");
		} else {
			System.out.println("���� ��ȣ�� ã�� �� ����");
		}
		this.balance -= money;
		return money;
	}
	void Alarm() {
	}
}
