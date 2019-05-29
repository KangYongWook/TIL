package db3;



public abstract class DB <T,A>{ // 제네릭스
	
	public abstract void insert(T obj);//T->user 
	public abstract T select(A obj);// A-> String
	
	
}
