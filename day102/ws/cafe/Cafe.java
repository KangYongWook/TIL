package ws.cafe;

public abstract class Cafe<K, V> {
	public abstract void order(V v)
			throws Exception;
	
	public void checkData(V v) {
		System.out.println("Check Ok ...");
	}
	public void transactionStart() {
		System.out.println("Transaction Start ...");
	}
	public void transactionEnd() {
		System.out.println("Transaction End ...");
	}

	public void Americano() {
		// TODO Auto-generated method stub
		
	}
}
