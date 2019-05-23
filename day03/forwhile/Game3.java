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
        System.out.println("숫자 두개를 뽑으세요! : ");
        int user1 = sc.nextInt();
        int user2 = sc.nextInt();
 
        if (user1 < 1 || user1 > 6 || user2 < 1 || user2 > 6) {
            System.out.println("잘못 입력하셨습니다.");
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
                                System.out.println("오늘 최악입니다.");
                            }else {
                            System.out.println("로또 사세요:D");
                            }
                            break;
                        case 1:
                            if(i*j%3 == 0) {
                                System.out.println("낯선 사람을 만나게 됩니다.");
                            }
                            else{
                                System.out.println("쉬면서 하루를 보내세요.");
                            }
                            break;
                        case -1:
                            if(i+j>4) {
                                System.out.println("이성과 동성을 대함에 차별을 둬야하는 날입니다.");
                            }else {
                                System.out.println("조심하세요");    
                            }
                            
                        }
                    }
                }
            }
        }
        sc.close();
    }
    
 
}

