package forwhile;
 
import java.util.Scanner;
 
public class Game4 {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = "";
        String str2="";
        System.out.println("주사위를 굴려주세요~:)");
        int x, y;
        x=sc.nextInt();
        y=sc.nextInt();
        
        if((x<1 || x>6) || (y<1 || y>6)) {
            System.out.println("잘못된 입력값입니다.");
            return;
        }
        for(int i=1;i<=6;i++) {
            for(int j=1;j<=6;j++) {
                if(i%3==0)
                    str="웃음이 예쁜 당신, ";
                else if(i%3==1)
                    str="언제나 듬직한 당신, ";
                else
                    str="항상 사랑받는 당신, ";
                
                if(i%2==0) {
                    str+="오늘 많이 힘드시죠?\n";
                }
                else {
                    str+="오늘은 기분이 어떠세요?\n";
                }
                
                switch(j) {
                case 1:str+="좋은 인연을 만나실거에요:)";
                       break;
                case 2:str+="외출을 권장합니다!";
                       break;
                case 3:str+="좋아하는 음식을 마음껏 드세요~~";
                       break;
                case 4:str+="오늘은 많이 웃어보세요:)";
                       break;
                case 5:str+="사람을 조심하세요...";
                       break;
                case 6:str+="가족들과 함께 시간을 보내세요";
                        break;
                default: str="에러입니다.";
                }
                
                if(x==i && y==j) {
                    str2=str;
                    break;
                }
            }
        }
        System.out.println(str2);
    }
}




