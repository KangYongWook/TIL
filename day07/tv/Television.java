package tv;

public class Television {
	
	// attribute 속성
	private String color; // public -> 어디에서나 접근가능
	private boolean power; //private-> 같은 클레스에서만 사용가능
	private int channel; // 아무것도안써진상태는 같은 pakage안에서만 사용가능
	
	// contructor 초기화영역  
	Television(){
		color = "red";
		power = false;
		channel = 10;	
	}
	Television(String color, boolean power, int channel){ //함수명은 같으나 argument값이 다르면 오류x (()의 값을 말함)
		this.color = color;   //같은거를 넣을때는 this를 붙여줌 주소라고 생각하면됨 
		this.power = power;
		this.channel = channel;	
	}
	Television(String color){
		this.color = color;
		this.power = false;
		this.channel= 10;
	}
	
	//function 기능
	
	public void power() {
		power = !power;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		//숫자 못 들어오게 한다.
		// 컬러는몇개로 정해서 동작 한다.
		if(color.equals("") || color == null) {
			return;
		}
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public void channelUp() {
		channel++;
	}
	
	public void channelDown() {
		channel--;
	}

	@Override
	public String toString() {
		return "Television [color=" + color + ", power=" + power + ", channel=" + channel + "]";
	}
	
}
