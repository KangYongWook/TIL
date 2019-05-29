package com.sds.component;

import java.util.ArrayList;

import com.sds.frame.Biz;
import com.sds.frame.Dao;
import com.sds.vo.Product;
import com.sds.vo.User;

public class ProductBiz extends Biz<Integer, Product> {
	
	Dao<Integer, Product> dao;
	public ProductBiz() {
		dao = new ProductDao();
	}
	@Override
	public void register(Product v) throws Exception {
		checkData(v);
		transactionStart();//Ʈ����� -> �����ͺ��̽����� ���º�ȭ�� ��Ű�����ؼ� �����ϴ´���
		try {
		dao.insert(v); // �������� �Լ��ȿ� Exception���߱⶧�� �ٷ� Exception�̵� �׷� transactionEnd�� �����̾ȵ�. �׷��� try catch�� �ذ�����
		}catch(Exception e) {
			throw e;
		}finally { // �ᱹ�� ..  try�� �ϰ� ������ catch�� �ϰ����� �ᱹ �����ض�.
			transactionEnd();
		}
	}

	@Override
	public void remove(Integer k) throws Exception {
		transactionStart();//Ʈ����� -> �����ͺ��̽����� ���º�ȭ�� ��Ű�����ؼ� �����ϴ´���
		try {
		dao.delete(k); // �������� �Լ��ȿ� Exception���߱⶧�� �ٷ� Exception�̵� �׷� transactionEnd�� �����̾ȵ�. �׷��� try catch�� �ذ�����
		}catch(Exception e) {
			throw e;
		}finally { // �ᱹ�� ..  try�� �ϰ� ������ catch�� �ϰ����� �ᱹ �����ض�.
			transactionEnd();
		}
		
	}

	@Override
	public void modify(Product v) throws Exception {
		checkData(v);
		transactionStart();//Ʈ����� -> �����ͺ��̽����� ���º�ȭ�� ��Ű�����ؼ� �����ϴ´���
		try {
		dao.update(v); // �������� �Լ��ȿ� Exception���߱⶧�� �ٷ� Exception�̵� �׷� transactionEnd�� �����̾ȵ�. �׷��� try catch�� �ذ�����
		}catch(Exception e) {
			throw e;
		}finally { // �ᱹ�� ..  try�� �ϰ� ������ catch�� �ϰ����� �ᱹ �����ض�.
			transactionEnd();
		}
		
	}

	@Override
	public Product get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public ArrayList<Product> get() throws Exception {
		// TODO Auto-generated method stub
		return dao.select();
	}

}
