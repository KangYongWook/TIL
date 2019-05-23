package forwhile;
 
import java.util.Scanner;
 
public class Game3 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 6; i++) {
             
                for (int j = 1; j <= 6; j++) {
                    System.out.print(" "+i+","+j+"  | ");
                }
                System.out.println();
        }
        System.out.println("���� �ΰ��� ��������! : ");
        int user1 = sc.nextInt();
        int user2 = sc.nextInt();
 
        if (user1 < 1 || user1 > 6 || user2 < 1 || user2 > 6) {
            System.out.println("�߸� �Է��ϼ̽��ϴ�.");
            sc.close();
            return;
        }
 
        for (int i = 1; i <= 6; i++) {
            if (i == user1) {
                for (int j = 1; j <= 6; j++) {
                    if (j == user2) {
                        switch ((i - j) % 2) {
                        case 0:
                            if(i>j) {
                                System.out.println("���� �־��Դϴ�.");
                            }else {
                            System.out.println("�ζ� �缼��:D");
                            }
                            break;
                        case 1:
                            if(i*j%3 == 0) {
                                System.out.println("���� ����� ������ �˴ϴ�.");
                            }
                            else{
                                System.out.println("���鼭 �Ϸ縦 ��������.");
                            }
                            break;
                        case -1:
                            if(i+j>4) {
                                System.out.println("�̼��� ������ ���Կ� ������ �־��ϴ� ���Դϴ�.");
                            }else {
                                System.out.println("�����ϼ���");    
                            }
                            
                        }
                    }
                }
            }
        }
        sc.close();
    }
    
 
}

