package ws;

import java.util.ArrayList;

public abstract class DB <T,A>{
	public abstract void intsert(T obj);
	public abstract T select(A obj);
	public abstract ArrayList<T> selectall();
	public abstract void update(T obj);
	public abstract void delete(A obj);

	
}
