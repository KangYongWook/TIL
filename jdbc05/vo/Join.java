package vo;

public class Join {
	
	String pname;
	String psubname;
	String fname;
	String floc;
	public Join() {
		
	}
	public Join(String pname, String psubname, String fname, String floc) {
		this.pname = pname;
		this.psubname = psubname;
		this.fname = fname;
		this.floc = floc;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPsubname() {
		return psubname;
	}
	public void setPsubname(String psubname) {
		this.psubname = psubname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFloc() {
		return floc;
	}
	public void setFloc(String floc) {
		this.floc = floc;
	}
	@Override
	public String toString() {
		return "Join [pname=" + pname + ", psubname=" + psubname + ", fname=" + fname + ", floc=" + floc + "]";
	}
	
	
	

}
