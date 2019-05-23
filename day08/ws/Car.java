package ws;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Car {
	private String serial ;
	private String name ;
	private Engine engine;
	private String color ;
	private static int cnt =1000;
	
	
	public Car() {
		
	}


	public Car( String name, Engine engine, String color) {
		this.serial = Serial();
		this.name = name;
		this.engine = engine;
		this.color = color;
		cnt++;
	}

	@Override
	public String toString() {
		return "Car [serial=" + serial + ", name=" + name + ", engine=" + engine + ", color=" + color + "]";
	}

	public String Serial() {
		Date today = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyymmddhhmmss");
		serial=date.format(today)+cnt;
		return serial;
		
	}
	
}
