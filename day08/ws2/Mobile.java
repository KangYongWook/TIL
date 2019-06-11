package ws2;

public abstract class Mobile {
	private String mobileName;
	private int baterySize;
	private String osType;
	
	
	public Mobile() {
	}


	public Mobile(String mobileName, int baterySize, String osType) {
		this.mobileName = mobileName;
		this.baterySize = baterySize;
		this.osType = osType;
	}


	public String getMobileName() {
		return mobileName;
	}


	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}


	public int getBaterySize() {
		return baterySize;
	}


	public void setBaterySize(int baterySize) {
		this.baterySize = baterySize;
	}


	public String getOsType() {
		return osType;
	}


	public void setOsType(String osType) {
		this.osType = osType;
	}
	
	
}
