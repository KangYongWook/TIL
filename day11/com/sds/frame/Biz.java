package com.sds.frame;
import java.util.ArrayList;


public abstract class Biz<K,V>{ // String User
	public abstract void register(V v)throws Exception;// user 가입 
	public abstract void remove(K k)throws Exception; // String 제거
	public abstract void modify(V v)throws Exception; //user를 수정 
	public abstract V get(K k)throws Exception;//id를 입력해서 user를 가져오겠따
	public abstract ArrayList<V> get() throws Exception;
	
	public void checkData(V v) { //검증
		System.out.println("Check Ok...");
	}
	
	public void transactionStart() {
		System.out.println("Transaction Start ....");
	}
	
	public void transactionEnd() {
		System.out.println("Transaction End ....");
	}
}
