package com.offcn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.dao.MobileDao;
import com.offcn.pojo.Mobile;

@Service
public class MobileServiceImp implements MobileService{
	
	@Autowired
	private MobileDao mobileDao;

	@Override
	public Mobile query(Integer number) {
		// TODO Auto-generated method stub
		return this.mobileDao.query(number);
	}

}
