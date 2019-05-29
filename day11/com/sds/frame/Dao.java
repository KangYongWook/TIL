package com.sds.frame;

import java.util.ArrayList;

public abstract class Dao<K,V> {
	public abstract void insert(V v) throws Exception; // 중간에오류가날수있다고 예언.알림. DB가죽거나 네트워크가끊어지거나
	public abstract void delete(K k) throws Exception;
	public abstract void update(V v) throws Exception;
	public abstract V select(K k) throws Exception;
	public abstract ArrayList<V> select() throws Exception;
	
}
