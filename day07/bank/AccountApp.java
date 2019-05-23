package bank;
 
import java.util.Scanner;
 
public class AccountApp {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //��������, �����̸�, ���¹�ȣ, �̸�, ��й�ȣ
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        long t = 0;
        int c = 0;
        int d = 0;
        Account a[] = new Account[3];
        a[0] = new Account("�����", "����", 123456789, "��ö��", 1234);
        a[1] = new Account("�����", "����", 987654321, "��ö��", 4321);
        System.out.println(a[1]);
 
 
        while (true) {
            System.out.println("����� ���¹�ȣ�� �Է��ϼ���");
            temp = sc.nextInt();
            for (int i = 0; i < a.length; i++) {
                if (a[i].getAccountnum() == temp) {
                    c = i;
                    System.out.println("��й�ȣ�� �Է��ϼ���");
                    temp = sc.nextInt();
                    if (a[c].getPin() == temp) {
                        System.out.println("����� ����������");
                        System.out.println(a[c]);
                        break;
                    } else {
                        System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�");
                        c = 9;
                        return;
                    }
 
                } else {
                    c = 9;
                }
 
            }
            if (c == 9) {
                System.out.println("�츮 �ý������� ��ȸ�� �� ���� �����Դϴ�.");
                return;
            }
 
            while (true) {
                System.out.println("���ϴ� ����� �����ϼ���:�Ա�(1), ���(2), �۱�(3), ����ݾ�Ȯ��(4), ��й�ȣ ����(5), ��������Ȯ��(6), ó������(7)");
                int key = sc.nextInt();
                if (key == 1) {
                    System.out.println("�Ա� �ݾ��� �Է����ּ���.");
                    long m = sc.nextInt();
                    a[c].deposit(m);
                } else if (key == 2) {
                    System.out.println("��� �ݾ��� �Է����ּ���.");
                    long m = sc.nextInt();
                    a[c].withdrawl(m);
                } else if (key == 3) {
                    System.out.println("�۱��� ���¹�ȣ�� �Է����ּ���.");
                    temp = sc.nextInt();
                    for (int i = 0; i < a.length; i++) {
                        if (a[c].getAccountnum() == temp) {
                            System.out.println("���� ���·� �۱��� �� �����ϴ�.");
                            break;
                        }
                        if (a[i].getAccountnum() == temp) {
                            System.out.println("�۱��� �ݾ��� �Է��� �ּ���");
                            t = sc.nextLong();
                            d = i;
                            send(a[c], a[d], t);
                            break;
                        }
                    }
 
 
                } else if (key == 4) {
                    a[c].showmoney();
                } else if (key == 5) {
                    a[c].changepin();
                } else if (key == 6) {
                    System.out.println(a[c].toString());
                } else if (key == 7) {
                    break;
                } else {
                    System.out.println("�߸��Է��ϼ̽��ϴ�.");
                }
            }
        }
 
 
    }
 
    public static void send(Account from, Account to, long amount) {
        from.withdrawl(amount);
        to.deposit(amount);
    }
 
}



