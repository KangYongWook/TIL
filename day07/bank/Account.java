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
        System.out.println("�ԱݵǾ����ϴ�");
    }
 
    void withdrawl(long input) {
        if (input < money) {
            money -= input;
            System.out.println("��ݵǾ����ϴ�");
        } else {
            System.out.println("�ܾ��� �����մϴ�.");
        }
 
    }
 
    void showmoney() {
        long m = getMoney();
        System.out.println("������ �ݾ�: " + m);
 
    }
 
    void send(long input) {
 
    }
 
    void changepin() {
        System.out.println("��й�ȣ�� �Է����ּ���");
        int pw = sc.nextInt();
        if (pw == getPin()) {
            System.out.println("���ο� ��J��ȣ�� �Է����ּ���");
            int npw = sc.nextInt();
            setPin(npw);
            System.out.println("��й�ȣ�� ����Ǿ����ϴ�.");
        } else {
            System.out.println("�߸� �Է��ϼ̽��ϴ�.");
        }
    }
 
    @Override
    public String toString() {
        return "��������: [�����: " + bankname + ", ��������: " + accounttype + ", ���¹�ȣ: " + accountnum
                + ", �̸�: " + name + ", �ܾ�: " + money + "]";
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



