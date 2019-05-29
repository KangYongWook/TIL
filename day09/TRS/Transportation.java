package TRS;

public abstract class  Transportation { 
	protected int fee; //요금
	protected double distance; //거리
	protected int time;
	protected int speed;
	protected String id;
	protected Point  a,d ;
	public Transportation() {
		
	}

	public Transportation(int fee, double distance, int time, int speed, String id, Point a, Point d) {
		this.fee = fee;
		this.distance = distance;
		this.time = time;
		this.speed = speed;
		this.id = id;
		this.a = a;
		this.d = d;
	}

	////////////////////////////////////////////////
	
	public void c_distance( ) {
	  	
		this.distance = Math.sqrt(Math.pow((a.x-d.x),2)+Math.pow((a.y-d.y), 2));



	}
	
	public void c_time() {
		;
		
		this.time = (int)(this.distance / this.speed*60) ;
		
	}

	public abstract int c_fee() ;
	
	@Override
	public String toString() {
		return "Transportation [fee=" + fee + ", distance=" + distance + ", time=" + time + ", speed=" + speed + ", id="
				+ id + "]";
	}
	
	
	
	
		
	
	
	
	

}
