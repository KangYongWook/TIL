package car;
 
import java.util.Scanner;
 
public class CarApp {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //��, Ÿ��, ������, ����, �⸧,����
        Scanner sc = new Scanner(System.in);
        Car mycar = new Car("blue","������ī",12,0);
        while(true) {
            System.out.println("���ϴ� ����� �������ּ���: �� ���� ����(1), �õ��ɱ�(2), �⸧ �ֱ�(3)");
            int key = sc.nextInt();
            if(key==1) {
                System.out.println(mycar.toString());
                
            }else if(key==2) {
                mycar.power();
                System.out.println("�õ��� �ɷȽ��ϴ�.");
                while(mycar.isPower()) {
                    System.out.println("���ϴ� ����� �������ּ���: �� ���� ����(1), ����(2), ����(3), ��ȸ��(4), ��ȸ��(5), ����Ʈ(6), Ʈ��ũ(7), ��(8), �׺�(9), ���ڽ�(10) �õ�����(11) ");
                    int k = sc.nextInt();
                    if(k==1) {
                        System.out.println(mycar.toString());
                    }else if(k==2) {
                        mycar.speedUp();
                    }else if(k==3) {
                        mycar.speedDown();
                    }else if(k==4) {
                        mycar.left();
                    }else if(k==5) {
                        mycar.Right();
                    }else if(k==6) {
                        mycar.light();
                    }else if(k==7) {
                        if(mycar.getSpeed()>0) {
                            System.out.println("ġ�� ������ ������ �� Ʈ��ũ�� �����ּ���");
                        }else mycar.trunk();
                    }else if(k==8) {
                        if(mycar.getSpeed()>0) {
                            System.out.println("ġ�� ������ ������ �� ���� �����ּ���");
                        }else mycar.door();
                    }else if(k==9) {
                        mycar.nevi();
                    }else if(k==10) {
                        mycar.blackbox();
                    }else if(k==11) {
                        if(mycar.getSpeed()>0) {
                            System.out.println("���� ������ ������ �� �õ��� ���ּ���");
                        }else mycar.power();
                    }else System.out.println("�߸������ϼ̽��ϴ�.");
                mycar.drive();
                }
            }else if(key==3) {
                System.out.println("�󸶳� �����ðڽ��ϱ�?");
                int fuel = sc.nextInt();
                mycar.Addfuel(fuel);
                System.out.println("�⸧�� �����Ǿ����ϴ�.");    
            }else {
                System.out.println("�߸� �Է��ϼ̽��ϴ�.");
            }
        }
    
    }
}



