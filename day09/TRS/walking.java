package TRS;

public class walking extends Transportation{

	@Override
	
	
	public int c_fee() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	public walking() {
		super();
		// TODO Auto-generated constructor stub
	}



	public walking(int fee, double distance, int time, int speed, String id, Point a, Point d) {
		super(fee, distance, time, speed, id, a, d);
		// TODO Auto-generated constructor stub
	}



	public String toString() {
		return "Transportation [fee=" + fee + ", distance=" + distance + ", time=" + time + ", speed=" + speed + ", id="
				+ id + "]";
	}
	
	
}
