package com.sds.frame;
import java.util.ArrayList;


public abstract class Biz<K,V>{ // String User
	public abstract void register(V v)throws Exception;// user ���� 
	public abstract void remove(K k)throws Exception; // String ����
	public abstract void modify(V v)throws Exception; //user�� ���� 
	public abstract V get(K k)throws Exception;//id�� �Է��ؼ� user�� �������ڵ�
	public abstract ArrayList<V> get() throws Exception;
	
	public void checkData(V v) { //����
		System.out.println("Check Ok...");
	}
	
	public void transactionStart() {
		System.out.println("Transaction Start ....");
	}
	
	public void transactionEnd() {
		System.out.println("Transaction End ....");
	}
}
