package transportation;

public abstract class Transportation {
	protected Location location;
	protected double distance;
	
	
	public Transportation() {
	}



	public Transportation(Location location) {
		this.location = location;
		getDistance(this.location.getCurrentx(),this.location.getCurrenty()
				,this.location.getLastx(),this.location.getLasty());
	
	}



	@Override
	public String toString() {
		return "Transportation [location=" + location + "]";
	}



	public Location getLocation() {
		return location;
	}



	public void setLocation(Location location) {
		this.location = location;
		
	}
	
	public void getDistance(int currentx, int currenty, int lastx, int lasty) {
		
		this.distance = Math.sqrt(Math.pow(lastx-currentx, 2)+Math.pow(lasty-currenty, 2));
		
	}

	public abstract double getFee();
}
