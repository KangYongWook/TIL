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
		System.out.printf("%d명 탑승하셨습니다.");
	}
	
	void Fuel() {
		if(fuel <= 10) {
			System.out.println("연료가 떨어졌습니다. 연료를 주입하세요.");
		}
	}
	
	void Sensoroper() {
		
	}
	void Power(boolean power) {
		if(power==true) {
			System.out.println("시동이 켜졌습니다.");
		}
	}
	void Direction (String direction) {
		
	}
	
	void SpeedLimit() {
		
	}
}
