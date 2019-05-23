package bank;
 
import java.util.Scanner;
 
public class AccountApp {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //통장종류, 은행이름, 계좌번호, 이름, 비밀번호
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        long t = 0;
        int c = 0;
        int d = 0;
        Account a[] = new Account[3];
        a[0] = new Account("입출금", "농협", 123456789, "김철수", 1234);
        a[1] = new Account("입출금", "농협", 987654321, "김철수", 4321);
        System.out.println(a[1]);
 
 
        while (true) {
            System.out.println("당신의 계좌번호를 입력하세요");
            temp = sc.nextInt();
            for (int i = 0; i < a.length; i++) {
                if (a[i].getAccountnum() == temp) {
                    c = i;
                    System.out.println("비밀번호를 입력하세요");
                    temp = sc.nextInt();
                    if (a[c].getPin() == temp) {
                        System.out.println("당신의 계좌정보는");
                        System.out.println(a[c]);
                        break;
                    } else {
                        System.out.println("비밀번호가 틀렸습니다");
                        c = 9;
                        return;
                    }
 
                } else {
                    c = 9;
                }
 
            }
            if (c == 9) {
                System.out.println("우리 시스템으로 조회할 수 없는 계좌입니다.");
                return;
            }
 
            while (true) {
                System.out.println("원하는 기능을 선택하세요:입금(1), 출금(2), 송금(3), 통장금액확인(4), 비밀번호 변경(5), 통장정보확인(6), 처음으로(7)");
                int key = sc.nextInt();
                if (key == 1) {
                    System.out.println("입금 금액을 입력해주세요.");
                    long m = sc.nextInt();
                    a[c].deposit(m);
                } else if (key == 2) {
                    System.out.println("출금 금액을 입력해주세요.");
                    long m = sc.nextInt();
                    a[c].withdrawl(m);
                } else if (key == 3) {
                    System.out.println("송금할 계좌번호를 입력해주세요.");
                    temp = sc.nextInt();
                    for (int i = 0; i < a.length; i++) {
                        if (a[c].getAccountnum() == temp) {
                            System.out.println("같은 계좌로 송금할 수 없습니다.");
                            break;
                        }
                        if (a[i].getAccountnum() == temp) {
                            System.out.println("송금할 금액을 입력해 주세요");
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
                    System.out.println("잘못입력하셨습니다.");
                }
            }
        }
 
 
    }
 
    public static void send(Account from, Account to, long amount) {
        from.withdrawl(amount);
        to.deposit(amount);
    }
 
}



