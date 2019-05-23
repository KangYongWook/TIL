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
    
    //��, Ÿ��, ������, ����, �⸧,����
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
        System.out.println("���� �ӵ���"+speed+"�Դϴ�.");
        }else {
            System.out.println("�⸧�� �����մϴ�.");
            oil=0;
            speed=0;
            System.out.println("���� �����Ͽ����ϴ�.");
        }
    }void speedDown(){
        if(speed>0) {
            speed-= 10;
            System.out.println("���� �ӵ���"+speed+"�Դϴ�.");
            if(speed<=0) {
                speed=0;
                System.out.println("���� �����߽��ϴ�.");
            }
        }else {
            speed=0;
            System.out.println("���� �����߽��ϴ�.");
        }
    }void sunroof(){
        sunroof= !sunroof;
        if(sunroof) System.out.println("�������� �������ϴ�");
        else System.out.println("�������� �ݾҽ��ϴ�.");
    }void left(){
        angle-=5;
        System.out.println("���� �ڵ� ������"+getAngle());
    }void Right(){
        angle+=5;
        System.out.println("���� �ڵ� ������"+getAngle());
    }void light(){
        light = !light;
        if(light) System.out.println("����Ʈ�� �������ϴ�.");
        else System.out.println("����Ʈ�� �������ϴ�.");
    }void trunk(){
        trunk = !trunk;
        if(trunk) System.out.println("Ʈ��ũ�� �������ϴ�.");
        else System.out.println("Ʈ��ũ�� �ݾҽ��ϴ�.");
    }void door(){
        door = !door;
        if(door) System.out.println("���� ���Ƚ��ϴ�.");
        else System.out.println("���� �������ϴ�.");
    }void Addfuel(int oil){
        this.oil+=oil;
    }void nevi(){
        nevi = !nevi;
        if(nevi) System.out.println("�׺���̼��� �������ϴ�. ���� �ȳ��մϴ�.");
        else System.out.println("�׺���̼��� �������ϴ�.");
    }void blackbox(){
        blackbox = !blackbox;
        if(blackbox) System.out.println("��ȭ�� �����մϴ�.");
        else System.out.println("��ȭ�� �����մϴ�.");
    }void drive(){
        if(speed>0) {
            d_time++;
            d_distance+=speed;
            oil-=speed/e_fuel;
            System.out.println("���� ����ð��� "+d_time+"�ð�, ����Ÿ��� "+d_distance+"km, ���� �⸧�� "+oil+"l�Դϴ�.");
        }else {
            d_distance=0;
            d_time=0;
        }
        
    }
    @Override
    public String toString() {
        return "Car [��: " + color + ", �� ����: " + car_type + ", ����: " + e_fuel
                + ", ���� �⸧: " + oil +", �׺���̼� ����: " + nevi + ", ������: " + sunroof + ", ���ڽ�: "
                + blackbox + ", �ڵ� ����: " + angle + ", �õ�: " + power + ", �ӵ�: " + speed + ", ����Ʈ: " + light
                + ", Ʈ��ũ: " + trunk + ", ��: " + door + "]";
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


