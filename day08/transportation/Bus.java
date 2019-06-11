package transportation;

public class Bus extends Transportation {

	private double generalfee = 1300;

	public Bus() {
	}

	public Bus(double generalfee) {
		this.generalfee = generalfee;
	}

	public Bus(Location location) {
		super(location);
		
	}

	@Override
	public String toString() {
		return "Bus [location=" + location + ", distance=" + distance + ",\n generalfee=" + generalfee + "]";
	}

	public double getGeneralfee() {
		return generalfee;
	}

	public void setGeneralfee(double generalfee) {
		this.generalfee = generalfee;
	}

	@Override
	public double getFee() {
		double fee = 0.0;
		double plusfee = 0.0;
		if(super.distance >= 150) {
			plusfee = 200;
		}else if(super.distance >= 200) {
			plusfee = 500;
		}
		fee = generalfee+plusfee;
		return fee;
	}

}
