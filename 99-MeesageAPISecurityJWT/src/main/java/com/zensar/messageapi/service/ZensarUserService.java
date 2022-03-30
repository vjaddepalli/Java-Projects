package com.zensar.messageapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.messageapi.dao.ZensarUserDao;
import com.zensar.messageapi.entity.ZensarUser;

@Service
public class ZensarUserService {

	@Autowired
	ZensarUserDao dao;
	
	public ZensarUser addZensarUser(ZensarUser user) {
		return this.dao.save(user);
	}
}
