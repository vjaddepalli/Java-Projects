package com.zensar.messageapi.rest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.zensar.messageapi.entity.Message;
import com.zensar.messageapi.repository.MessageRepository;
import com.zensar.messageapi.repository.ZensarUserRepository;

@RestController
@RequestMapping("/api/message")
public class MessageRestController {

	@Autowired
	MessageRepository repo;
	

	/*
	 * 
	 * Any method which creates a new resources on server its return http status 201
	 * 
	 */
	@PostMapping("/add")
	public ResponseEntity<Message> addNewMessage(@RequestBody Message request) {
		
		System.out.println("<<<<--Coming From addNewMessage() --->>>>");
		
		Message message=new Message();
		message.setId(request.getId());
		message.setName(request.getName());
		repo.save(message);
		ResponseEntity<Message> responseEntity=new ResponseEntity<Message>(message, HttpStatus.CREATED);
		return responseEntity;
		
	}
	
	@GetMapping()
	public ResponseEntity<List<Message>>  getMessages() {

		System.out.println("<<<---From getMesssage()---->>>");
		List<Message> messages=repo.findAll();
		ResponseEntity<List<Message>> responseEntity=new ResponseEntity<List<Message>>(messages, HttpStatus.OK);
		
		return responseEntity;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Message> findById(@PathVariable(name="id") int id) {
		
		Message message=repo.findById(id);;
		ResponseEntity<Message> responseEntity=new ResponseEntity<Message>(message, HttpStatus.OK);
		return responseEntity;
	}
	/*
	 * 
	 * Any method which creates a new resources on server its return http status 200
	 * 
	 */
	@PutMapping("/update")
	public ResponseEntity<Message> updateMessageById(@RequestBody Message request) {
		System.out.println("<<<<--Coming From updateMessage--->>>>");
		Message message=repo.findById(request.getId());
		message.setName(request.getName());
		
		ResponseEntity<Message> responseEntity=new ResponseEntity<Message>(message, HttpStatus.OK);
		return responseEntity;
	}
	
	/*
	 * 
	 * Any method which creates a new resources on server its return http status 204
	 * 
	 */

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteMessageById(@PathVariable(name = "id") int id) {

		System.out.println("<<<<--Coming From deleteMessage--->>>>");

		ResponseEntity<Void> responseEntity=new ResponseEntity<>(HttpStatus.NO_CONTENT);
		Message message=repo.findById(id);
		
		repo.delete(message);
		return responseEntity;
	}
	
	

}
