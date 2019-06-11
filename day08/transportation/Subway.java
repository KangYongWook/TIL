package transportation;

public class Subway extends Transportation {

	private double generalfee = 1500;

	public Subway() {
	}

	public Subway(double generalfee) {
		this.generalfee = generalfee;
	}

	public Subway(Location location) {
		super(location);
		
	}

	@Override
	public String toString() {
		return "Subway [location=" + location + ", distance=" + distance + ",\n generalfee=" + generalfee + "]";
	}

	public double getGeneralfee() {
		return generalfee;
	}

	public void setGeneralfee(double generalfee) {
		this.generalfee = generalfee;
	}

	public double getFee() {
		double fee = 0.0;
		double plusfee = 0.0;
		if (super.distance >= 150) {
			plusfee = 300;
		} else if (super.distance >= 200) {
			plusfee = 600;
		}
		fee = generalfee + plusfee;
		return fee;
	}
}
