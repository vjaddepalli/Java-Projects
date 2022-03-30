package com.zensar.messageapi.rest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.messageapi.dto.Message;

@RestController
@RequestMapping("/api/message")
public class MessageRestController {

	private List<Message> messages = new ArrayList<>();

	public MessageRestController() {
		super();
		Message m1 = new Message(101, "Vijay");
		Message m2 = new Message(102, "Ram");
		Message m3 = new Message(103, "Bhim");
		Message m4 = new Message(104, "Vikram");

		this.messages.add(m1);
		this.messages.add(m2);
		this.messages.add(m3);
		this.messages.add(m4);

	}

	@GetMapping()
	public List<Message> getMessages() {

		System.out.println("<<<<--Coming From getMessages() --->>>>");

		return messages;

	}
	
	@PutMapping("/update")
	public Message updateMessageById(@RequestBody Message request) {
		System.out.println("<<<<--Coming From updateMessage--->>>>");
		Iterator<Message> iterator = this.messages.iterator();
		Message message=null;
		while (iterator.hasNext()) {
			message = iterator.next();
			if (message.getId() == request.getId()) {
				
				message.setName(request.getName());
			}
			
		}
		return message;
		
		
	}

	@DeleteMapping("/{id}")
	public void deleteMessageById(@PathVariable(name = "id") int id) {

		System.out.println("<<<<--Coming From deleteMessage--->>>>");

		Iterator<Message> iterator = this.messages.iterator();
		while (iterator.hasNext()) {
			Message message = iterator.next();
			if (message.getId() == id) {
				iterator.remove();
			}
		}

	}

}
