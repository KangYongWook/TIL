package transportation;

public class Taxi extends Transportation {

	private double generalfee = 3800;
	private String kinds;
	private String payment;

	public Taxi() {
	}

	public Taxi(double generalfee, String kinds) {
		this.generalfee = generalfee;
		this.kinds = kinds;
	}

	public Taxi(Location location, String kinds) {
		super(location);
		this.kinds = kinds;
	}

	@Override
	public String toString() {
		return "Taxi [location=" + location + ", distance=" + distance + ",\n generalfee=" + generalfee + ", kinds="
				+ kinds + ", payment=" + payment + "]";
	}

	public double getGeneralfee() {
		return generalfee;
	}

	public void setGeneralfee(double generalfee) {
		this.generalfee = generalfee;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	@Override
	public double getFee() {
		double fee = generalfee;
		if(this.kinds.equals("¸ð¹ü")){
			fee = 5000;
			
		}
		
		if (super.distance >= 150) {
			fee = fee * 1.5;
		} else if (super.distance >= 200) {
			fee = fee * 1.8;
		}
		
		return (long)fee;
	}

	public void paymentMethod(String payment) {
		this.payment = payment;
	}
}
