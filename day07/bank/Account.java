package bank;
 
import java.util.Scanner;
 
public class Account {
    private String bankname;
    private String accounttype;
    private int accountnum;
    private String name;
    private long money;
    private int pin;
    Scanner sc = new Scanner(System.in);
 
    Account(String accounttype, String bankname, int accountnum, String name, int pin) {
        this.accountnum = accountnum;
        this.name = name;
        this.bankname = bankname;
        this.money = 0L;
        this.pin = pin;
        this.accounttype = accounttype;
    }
 
    void deposit(long input) {
        money += input;
        System.out.println("입금되었습니다");
    }
 
    void withdrawl(long input) {
        if (input < money) {
            money -= input;
            System.out.println("출금되었습니다");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
 
    }
 
    void showmoney() {
        long m = getMoney();
        System.out.println("계좌의 금액: " + m);
 
    }
 
    void send(long input) {
 
    }
 
    void changepin() {
        System.out.println("비밀번호를 입력해주세요");
        int pw = sc.nextInt();
        if (pw == getPin()) {
            System.out.println("새로운 비밓번호를 입력해주세요");
            int npw = sc.nextInt();
            setPin(npw);
            System.out.println("비밀번호가 변경되었습니다.");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
 
    @Override
    public String toString() {
        return "통장정보: [은행명: " + bankname + ", 통장유형: " + accounttype + ", 계좌번호: " + accountnum
                + ", 이름: " + name + ", 잔액: " + money + "]";
    }
 
    public long getMoney() {
        return money;
    }
 
    public String getName() {
        return name;
    }
 
    public int getPin() {
        return pin;
    }
 
    public void setPin(int pin) {
        this.pin = pin;
    }
 
    public int getAccountnum() {
        return accountnum;
    }
 
    public String getBankname() {
        return bankname;
    }
 
    public String getAccounttype() {
        return accounttype;
    }
 
}



