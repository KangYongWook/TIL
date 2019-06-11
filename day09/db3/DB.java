package db3;

public abstract class DB<T,U> {
	public abstract void insert(T obj);
	public abstract T select(U obj);
}
