package forwhile;
 
import java.util.Scanner;
 
public class Game4 {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = "";
        String str2="";
        System.out.println("�ֻ����� �����ּ���~:)");
        int x, y;
        x=sc.nextInt();
        y=sc.nextInt();
        
        if((x<1 || x>6) || (y<1 || y>6)) {
            System.out.println("�߸��� �Է°��Դϴ�.");
            return;
        }
        for(int i=1;i<=6;i++) {
            for(int j=1;j<=6;j++) {
                if(i%3==0)
                    str="������ ���� ���, ";
                else if(i%3==1)
                    str="������ ������ ���, ";
                else
                    str="�׻� ����޴� ���, ";
                
                if(i%2==0) {
                    str+="���� ���� �������?\n";
                }
                else {
                    str+="������ ����� �����?\n";
                }
                
                switch(j) {
                case 1:str+="���� �ο��� �����ǰſ���:)";
                       break;
                case 2:str+="������ �����մϴ�!";
                       break;
                case 3:str+="�����ϴ� ������ ������ �弼��~~";
                       break;
                case 4:str+="������ ���� �������:)";
                       break;
                case 5:str+="����� �����ϼ���...";
                       break;
                case 6:str+="������� �Բ� �ð��� ��������";
                        break;
                default: str="�����Դϴ�.";
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




