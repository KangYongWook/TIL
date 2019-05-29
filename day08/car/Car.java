package car;

public class Car {
	
		//attribute
		private String name;
		private String color;
		private int fSize;
		private int cfSize;
		private int speed;
		private int maxSpeed;
		private int defaultSize = 100;
		
		private int serial;
		private static int count =1;
		//inintialization block
		{
			count++;
			serial = count;
		}
		static {
			count += 1000;
		}
		
		//constructor
		public Car() { //default constructor
			this.name = "K1";
			this.color = "red";
			this.fSize = 50;
			this.maxSpeed = 50;
			
		}
		public Car(String name, String color, int fSize) {//overload
			this.name = name;
			this.color = color;
			this.fSize = fSize;
		}
		
		public Car(String name, String color, int fSize, int maxSpeed) {
			this.name = name;
			this.color = color;
			this.fSize = fSize;
			this.maxSpeed = maxSpeed;
		}
		public Car(String name, String color, int fSize, int cfSize, int speed) {
			this.name = name;
			this.color = color;
			this.fSize = fSize;
			this.cfSize = cfSize;
			this.speed = speed;
		}
		//function
		
		@Override
		public String toString() {
			return "Car [name=" + name + ", color=" + color + ", fSize=" + fSize + ", cfSize=" + cfSize + ", speed="
					+ speed + "]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getfSize() {
			return fSize;
		}
		public void setfSize(int fSize) {
			this.fSize = fSize;
		}
		public int getCfSize() {
			return cfSize;
		}
		public void setCfSize(int cfSize) throws Exception {
			if(this.cfSize + cfSize > fSize) {
				throw new Exception(); // 문제생겼어라고 날림 
				//return; ->  Exception 사용시	필요없어짐
				}
				
			this.cfSize += cfSize;
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			if(this.maxSpeed < speed)
			{	
				this.speed = this.maxSpeed;
				return;
			}
			this.maxSpeed = speed;
			
		}
		
		public void go(int level) {
			//level 1~5
			//spped up 1:10km
			//fuel down 1L 10km
			switch(level){
			case 1:
				this.setSpeed(20);
				this.cfSize -=1;
				break;
			case 2:
				this.setSpeed(40);
				this.cfSize -=2;
				break;
			case 3:
				this.setSpeed(60);
				this.cfSize -=3;
				break;
			case 4:
				this.setSpeed(80);
				this.cfSize -=4;
				break;
			case 5:
				this.setSpeed(100);
				this.cfSize -=5;
				break;
			default:
				break;		
				
			}
		}
		public void stop() {
			this.speed = 0;
		}
		
		
		
		
}
