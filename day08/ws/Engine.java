package ws;

public class Engine {
	private int displacement; // 배기량
	private int e_type ;// 엔진타입 4기통 6기통
	
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
