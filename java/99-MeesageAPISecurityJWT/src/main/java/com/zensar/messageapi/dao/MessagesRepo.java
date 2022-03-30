package com.zensar.messageapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.messageapi.bean.Message;

@Repository
public interface MessagesRepo extends JpaRepository<Message, Integer> {
	
}
