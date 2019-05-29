package com.sds.component;

import java.util.ArrayList;

import com.sds.frame.Biz;
import com.sds.frame.Dao;
import com.sds.vo.User;

public class UserBiz extends Biz<String, User> {
	
	Dao<String, User> dao;
	public UserBiz() {
		dao = new UserDao();
	}
	@Override
	public void register(User v) throws Exception {
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
	public void remove(String k) throws Exception {
		
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
	public void modify(User v) throws Exception {
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
	public User get(String k) throws Exception {
		
		return dao.select(k);
	}

	@Override
	public ArrayList<User> get() throws Exception {
		// TODO Auto-generated method stub
		return dao.select();
	}

}
