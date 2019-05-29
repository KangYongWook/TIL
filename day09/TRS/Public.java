package TRS;



public class Public extends Transportation{
    private int initialfee; //기본요금
    
    
 

	public Public() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Public(int fee, double distance, int time, int speed, String id, Point a, Point d) {
		super(fee, distance, time, speed, id, a, d);
		// TODO Auto-generated constructor stub
	}

	public int c_fee() {
        int money = (int)(this.initialfee + this.distance*this.fee);
        return money;
    }
 
    @Override
    public String toString() {
        return "Public [fee=" + fee + ", distance=" + distance + ", time=" + time + ", speed=" + speed + ", id=" + id
                + ", a=" + a + ", d=" + d + ", initialfee=" + initialfee + "]";
    }
    
 
}
 