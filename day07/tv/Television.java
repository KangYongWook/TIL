package tv;

public class Television {
	
	// attribute �Ӽ�
	private String color; // public -> ��𿡼��� ���ٰ���
	private boolean power; //private-> ���� Ŭ���������� ��밡��
	private int channel; // �ƹ��͵��Ƚ������´� ���� pakage�ȿ����� ��밡��
	
	// contructor �ʱ�ȭ����  
	Television(){
		color = "red";
		power = false;
		channel = 10;	
	}
	Television(String color, boolean power, int channel){ //�Լ����� ������ argument���� �ٸ��� ����x (()�� ���� ����)
		this.color = color;   //�����Ÿ� �������� this�� �ٿ��� �ּҶ�� �����ϸ�� 
		this.power = power;
		this.channel = channel;	
	}
	Television(String color){
		this.color = color;
		this.power = false;
		this.channel= 10;
	}
	
	//function ���
	
	public void power() {
		power = !power;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		//���� �� ������ �Ѵ�.
		// �÷��¸�� ���ؼ� ���� �Ѵ�.
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
