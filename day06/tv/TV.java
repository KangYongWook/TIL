package tv;

public class TV {
		//attribute
		private String color;//어디서나 접근가능
		private boolean power; //같은 패키지에서 접근가능
		private int channel;
		
		//constructor
		TV(){
			color = "red";
			power = false;
			channel = 10;
		}
		TV(String color, boolean power, int channel){
			this.color = color;
			this.power = power;
			this.channel =channel;
		}		
		TV(String color){
			this.color = color;
			this.power = false;
			this.channel = 10;
		}
		
		//get set
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			//숫자 못들어게 한다.
			//컬러는 몇개로 정해서 동작한다.
			if(color.contentEquals("") || color == null) {
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
		
		
		//function
		void power() {
			power = !power;
		}
		void channelUp() {
			channel++;
		}
		void channelDown() {
			channel--;
		}
		@Override
		public String toString() {
			return "TV [color=" + color + ", power=" + power + ", channel=" + channel + "]";
		}
		
		
		

		
		
		
}
