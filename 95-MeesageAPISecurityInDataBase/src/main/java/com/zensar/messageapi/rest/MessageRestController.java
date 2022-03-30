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
	
	

	

	@PostMapping("/add")
	public void addNewMessage(@RequestBody Message request) {
		
		System.out.println("<<<<--Coming From addNewMessage() --->>>>");
		
		Message message=new Message();
		message.setId(request.getId());
		message.setName(request.getName());
		repo.save(message);
		
	}
	
	@GetMapping()
	public List<Message> getMessages() {

		System.out.println("<<<---From getMesssage()---->>>");
		List<Message> messages=new ArrayList<>();
		//throw new RuntimeException();
		return messages=repo.findAll();

	}
	
	@GetMapping("/{id}")
	public Message findById(@PathVariable(name="id") int id) {
		return repo.findById(id);
	}
	
	@PutMapping("/update")
	public Message updateMessageById(@RequestBody Message request) {
		System.out.println("<<<<--Coming From updateMessage--->>>>");
		Message message=repo.findById(request.getId());
		message.setName(request.getName());
		
		return repo.save(message);
	}

	@DeleteMapping("/{id}")
	public void deleteMessageById(@PathVariable(name = "id") int id) {

		System.out.println("<<<<--Coming From deleteMessage--->>>>");

		Message message=repo.findById(id);
		
		repo.delete(message);
	}
	
	

}
