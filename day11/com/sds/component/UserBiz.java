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
		transactionStart();//트랜잭션 -> 데이터베이스에서 상태변화를 시키기위해서 수행하는단위
		try {
		dao.insert(v); // 오류나면 함수안에 Exception을했기때매 바로 Exception이됨 그럼 transactionEnd가 실행이안됨. 그래서 try catch로 해결해줌
		}catch(Exception e) {
			throw e;
		}finally { // 결국엔 ..  try를 하고 나가든 catch를 하고나가든 결국 실행해라.
			transactionEnd();
		}
		
	}

	@Override
	public void remove(String k) throws Exception {
		
		transactionStart();//트랜잭션 -> 데이터베이스에서 상태변화를 시키기위해서 수행하는단위
		try {
		dao.delete(k); // 오류나면 함수안에 Exception을했기때매 바로 Exception이됨 그럼 transactionEnd가 실행이안됨. 그래서 try catch로 해결해줌
		}catch(Exception e) {
			throw e;
		}finally { // 결국엔 ..  try를 하고 나가든 catch를 하고나가든 결국 실행해라.
			transactionEnd();
		}
		
		
	}

	@Override
	public void modify(User v) throws Exception {
		checkData(v);
		transactionStart();//트랜잭션 -> 데이터베이스에서 상태변화를 시키기위해서 수행하는단위
		try {
		dao.update(v); // 오류나면 함수안에 Exception을했기때매 바로 Exception이됨 그럼 transactionEnd가 실행이안됨. 그래서 try catch로 해결해줌
		}catch(Exception e) {
			throw e;
		}finally { // 결국엔 ..  try를 하고 나가든 catch를 하고나가든 결국 실행해라.
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
