package car;
 
public class Car {
    private String color;
    private String car_type;
    private int e_fuel;
    private double oil;
    private boolean nevi;
    private boolean sunroof;
    private boolean blackbox;
    private int angle;
    private boolean power;
    private int speed;
    private boolean light;
    private boolean trunk;
    private boolean door;
    private int d_time;
    private int d_distance;
    
    //색, 타입, 문개수, 연비, 기름,의자
    Car(String color, String car_type, int e_fuel, int oil){
        this.color=color;
        this.car_type=car_type;
        this.e_fuel=e_fuel;
        this.oil=oil;
    }
    void power() {
        power= !power;
    }void speedUp(){
        if(oil>0) {
        speed+= 10;
        System.out.println("현재 속도는"+speed+"입니다.");
        }else {
            System.out.println("기름이 부족합니다.");
            oil=0;
            speed=0;
            System.out.println("차가 정지하였습니다.");
        }
    }void speedDown(){
        if(speed>0) {
            speed-= 10;
            System.out.println("현재 속도는"+speed+"입니다.");
            if(speed<=0) {
                speed=0;
                System.out.println("차가 정지했습니다.");
            }
        }else {
            speed=0;
            System.out.println("차가 정지했습니다.");
        }
    }void sunroof(){
        sunroof= !sunroof;
        if(sunroof) System.out.println("선루프를 열었습니다");
        else System.out.println("선루프를 닫았습니다.");
    }void left(){
        angle-=5;
        System.out.println("현재 핸들 각도는"+getAngle());
    }void Right(){
        angle+=5;
        System.out.println("현재 핸들 각도는"+getAngle());
    }void light(){
        light = !light;
        if(light) System.out.println("라이트가 켜졌습니다.");
        else System.out.println("라이트가 꺼졌습니다.");
    }void trunk(){
        trunk = !trunk;
        if(trunk) System.out.println("트렁크를 열었습니다.");
        else System.out.println("트렁크를 닫았습니다.");
    }void door(){
        door = !door;
        if(door) System.out.println("문이 열렸습니다.");
        else System.out.println("문이 닫혔습니다.");
    }void Addfuel(int oil){
        this.oil+=oil;
    }void nevi(){
        nevi = !nevi;
        if(nevi) System.out.println("네비게이션이 켜졌습니다. 길을 안내합니다.");
        else System.out.println("네비게이션이 꺼졌습니다.");
    }void blackbox(){
        blackbox = !blackbox;
        if(blackbox) System.out.println("녹화를 시작합니다.");
        else System.out.println("녹화를 종료합니다.");
    }void drive(){
        if(speed>0) {
            d_time++;
            d_distance+=speed;
            oil-=speed/e_fuel;
            System.out.println("현재 주행시간은 "+d_time+"시간, 주행거리는 "+d_distance+"km, 남은 기름은 "+oil+"l입니다.");
        }else {
            d_distance=0;
            d_time=0;
        }
        
    }
    @Override
    public String toString() {
        return "Car [색: " + color + ", 차 유형: " + car_type + ", 연비: " + e_fuel
                + ", 남은 기름: " + oil +", 네비게이션 여부: " + nevi + ", 선루프: " + sunroof + ", 블랙박스: "
                + blackbox + ", 핸들 각도: " + angle + ", 시동: " + power + ", 속도: " + speed + ", 라이트: " + light
                + ", 트렁크: " + trunk + ", 문: " + door + "]";
    }
    public boolean isPower() {
        return power;
    }
    public int getSpeed() {
        return speed;
    }
    public int getAngle() {
        return angle;
    }
    public void setD_time(int d_time) {
        this.d_time = d_time;
    }
    
}


