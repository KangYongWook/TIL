package ws;

import java.util.ArrayList;

public abstract class DB<T,U> {
	public abstract void create(T obj);
	public abstract T select(U obj);
	public abstract void select();
	public abstract void delete(U obj);
	public abstract ArrayList<T> update(T obj);
}
