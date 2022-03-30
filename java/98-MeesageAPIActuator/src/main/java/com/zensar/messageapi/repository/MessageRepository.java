package com.zensar.messageapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.messageapi.entity.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer>{
	
	Message findById(int id);

}
