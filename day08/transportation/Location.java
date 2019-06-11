package transportation;

public class Location {
	private int currentx;
	private int currenty;
	private int lastx;
	private int lasty;
	
	
	public Location() {
	}

	public Location(int currentx, int currenty, int lastx, int lasty) {
		this.currentx = currentx;
		this.currenty = currenty;
		this.lastx = lastx;
		this.lasty = lasty;
	}

	public int getCurrentx() {
		return currentx;
	}

	public void setCurrentx(int currentx) {
		this.currentx = currentx;
	}

	public int getCurrenty() {
		return currenty;
	}

	public void setCurrenty(int currenty) {
		this.currenty = currenty;
	}

	public int getLastx() {
		return lastx;
	}

	public void setLastx(int lastx) {
		this.lastx = lastx;
	}

	public int getLasty() {
		return lasty;
	}

	public void setLasty(int lasty) {
		this.lasty = lasty;
	}

	@Override
	public String toString() {
		return "Location [currentx=" + currentx + ", currenty=" + currenty + ", lastx=" + lastx + ", lasty=" + lasty
				+ "]";
	}
	
	
	
}
