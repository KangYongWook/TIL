package car;

public class Car {

	String car ="";
	int number;
	int speed; 
	int fuel;
	int sensor;
	boolean power;
	String direction="";
	
	Car () {
		this.car = car;
		this.number = number;
		this.speed = speed;
		this.fuel = fuel;
		this.sensor = sensor;
		this.power = power;
		this.direction = direction;
		
	}
	
	void Peoplenum(int number) {
		int i = number;
		System.out.printf("%d�� ž���ϼ̽��ϴ�.");
	}
	
	void Fuel() {
		if(fuel <= 10) {
			System.out.println("���ᰡ ���������ϴ�. ���Ḧ �����ϼ���.");
		}
	}
	
	void Sensoroper() {
		
	}
	void Power(boolean power) {
		if(power==true) {
			System.out.println("�õ��� �������ϴ�.");
		}
	}
	void Direction (String direction) {
		
	}
	
	void SpeedLimit() {
		
	}
}
