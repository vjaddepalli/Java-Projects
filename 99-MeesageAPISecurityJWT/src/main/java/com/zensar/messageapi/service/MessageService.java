package com.zensar.messageapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.messageapi.bean.Message;
import com.zensar.messageapi.dao.MessagesRepo;

@Service
public class MessageService {
	
	@Autowired
	MessagesRepo repo;
	
	public List<Message> getAllMsgs() {
		return this.repo.findAll();
	}
	
	
}
