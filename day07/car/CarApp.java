package car;
 
import java.util.Scanner;
 
public class CarApp {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //색, 타입, 문개수, 연비, 기름,의자
        Scanner sc = new Scanner(System.in);
        Car mycar = new Car("blue","스포츠카",12,0);
        while(true) {
            System.out.println("원하는 기능을 선택해주세요: 차 정보 보기(1), 시동걸기(2), 기름 넣기(3)");
            int key = sc.nextInt();
            if(key==1) {
                System.out.println(mycar.toString());
                
            }else if(key==2) {
                mycar.power();
                System.out.println("시동이 걸렸습니다.");
                while(mycar.isPower()) {
                    System.out.println("원하는 기능을 선택해주세요: 차 정보 보기(1), 가속(2), 감속(3), 좌회전(4), 우회전(5), 라이트(6), 트렁크(7), 문(8), 네비(9), 블랙박스(10) 시동끄기(11) ");
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
                            System.out.println("치기 완전히 정지한 후 트렁크를 열어주세요");
                        }else mycar.trunk();
                    }else if(k==8) {
                        if(mycar.getSpeed()>0) {
                            System.out.println("치기 완전히 정지한 후 문을 열어주세요");
                        }else mycar.door();
                    }else if(k==9) {
                        mycar.nevi();
                    }else if(k==10) {
                        mycar.blackbox();
                    }else if(k==11) {
                        if(mycar.getSpeed()>0) {
                            System.out.println("차가 완전히 정지한 후 시동을 꺼주세요");
                        }else mycar.power();
                    }else System.out.println("잘못선택하셨습니다.");
                mycar.drive();
                }
            }else if(key==3) {
                System.out.println("얼마나 넣으시겠습니까?");
                int fuel = sc.nextInt();
                mycar.Addfuel(fuel);
                System.out.println("기름이 충전되었습니다.");    
            }else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    
    }
}



