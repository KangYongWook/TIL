package db3;



public abstract class DB <T,A>{ // ���׸���
	
	public abstract void insert(T obj);//T->user 
	public abstract T select(A obj);// A-> String
	
	
}
