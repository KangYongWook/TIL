package ws.vo;

public class User {
	String coffee;
	String place;
	double price;
	
	public User(String coffee, String place, double price) {
		this.coffee = coffee;
		this.place = place;
		this.price = price;
	}

	@Override
	public String toString() {
		return "User [coffee=" + coffee + ", place=" + place + ", price=" + price + "]";
	}

	public String getCoffee() {
		return coffee;
	}

	public void setCoffee(String coffee) {
		this.coffee = coffee;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
