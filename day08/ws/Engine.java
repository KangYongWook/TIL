package ws;

public class Engine {
	private int displacement; // ��ⷮ
	private int e_type ;// ����Ÿ�� 4���� 6����
	
	Engine(){
		
	}

	public Engine(int displacement, int e_type) {
		
		this.displacement = displacement;
		this.e_type = e_type;
	}



	@Override
	public String toString() {
		return "Engine [displacement=" + displacement + ", e_type=" + e_type + "]";
	}
	
}
