package ws;

import java.util.Arrays;

public class User {
	String name ;
	private Car cars[];
	
	public User(String name, Car[] cars) {
		this.name = name;
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", cars=" + Arrays.toString(cars) + "]";
	}
	
	
	

	
}
