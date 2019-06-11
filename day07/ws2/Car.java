package ws2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Car {
	public static int cnt=1000;
	private String name;
	private String color;
	
	Engine engine = new Engine();
	
	public Car() {
		
	}

	public Car(String name, String color, int eng) {
		this.name = name;
		this.color = color;
		try {
			engine.Enginestat(eng);
			
		} catch (Exception e1) {
			
			System.out.println(e1.getMessage());
			System.out.println();
		}
		cnt++;
	}
	public String Serial() {
		Date today = new Date();
		 SimpleDateFormat date = new SimpleDateFormat("yyyyMMdd");
		 SimpleDateFormat time = new SimpleDateFormat("-hhmmss-");
		return "Serial number: "+date.format(today)+time.format(today)+cnt;

	}
	@Override
	public String toString() {
		String en =engine.Engineout();
		String se =Serial();
		return "Car [name:" + name + ", color:" + color + ", engine:" + en +"\n"+se+"]";
	}
		
		
}
