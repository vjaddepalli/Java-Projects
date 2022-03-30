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
import org.springframework.web.bind.annotation.RestController;

import com.zensar.messageapi.bean.Message;
import com.zensar.messageapi.dao.MessagesRepo;
import com.zensar.messageapi.dao.ZensarUserDao;
import com.zensar.messageapi.service.MessageService;

@RestController
public class MessageController {

	private List<Message> msgList = new ArrayList<>();

	@Autowired
	private MessagesRepo repo;

	public MessageController() {
		super();
		// msgList=this.repo.findAll();
		// prepareList();
	}
	
	@GetMapping("/api/message/{id}")
	public ResponseEntity<Message> getMessageById(@PathVariable(name="id") int id){
		System.out.println("message by id");
		Message message= repo.findById(id).get();
		ResponseEntity<Message> responseEntity = new ResponseEntity<Message>(message, HttpStatus.OK);
		return responseEntity;
		
	}
	

	@GetMapping("/api/messages")
	public ResponseEntity<List<Message>> getAllMessages() throws Exception {
		System.out.println("In get all");
		msgList = this.repo.findAll();
		ResponseEntity<List<Message>> responseEntity = new ResponseEntity<List<Message>>(msgList, HttpStatus.OK);
		/*
		 * if(true) throw new Exception();
		 */
		return responseEntity;
	}

	@PutMapping("/api/update")
	public ResponseEntity<Message> updateMessage(@RequestBody Message messageParam) {

		Optional<Message> message = this.repo.findById(messageParam.getId());
		if (message.isPresent()) {
			Message createdMsg = this.repo.save(messageParam);
			ResponseEntity<Message> responseEntity = new ResponseEntity<Message>(createdMsg, HttpStatus.OK);
			return responseEntity;
		}
		return null;
		/*
		 * for (int i = 0; i < msgList.size(); i++) { if (msgList.get(i).getId() ==
		 * messageParam.getId()) { msgList.set(i, messageParam);
		 * System.out.println("AFTER UPDATING: " + msgList); return messageParam; } }
		 * return null;
		 */
	}

	@DeleteMapping("/api/delete/{id}")
	public ResponseEntity<Void> deleteMessageById(@PathVariable(name = "id") int id) {

		ResponseEntity<Void> responseEntity = new ResponseEntity<>(HttpStatus.NO_CONTENT);
		if (this.repo.findById(id) == null)
			return null;
		this.repo.deleteById(id);
		return responseEntity;
		/*
		 * Iterator<Message> iterator = this.msgList.iterator(); while
		 * (iterator.hasNext()) { if (iterator.next().getId() == id) {
		 * iterator.remove(); System.out.println("AFTER DELETING: " + msgList); return
		 * true; } } return false;
		 */
	}

	@PostMapping("/api/addMessage")
	public ResponseEntity<Message> add(@RequestBody Message message) {
		Message createdMsg = this.repo.save(message);
		ResponseEntity<Message> responseEntity = new ResponseEntity<Message>(createdMsg, HttpStatus.CREATED);
		return responseEntity;
		/*
		 * msgList.add(message); System.out.println("AFTER ADDING: " + msgList); return
		 * true;
		 */
	}

	// it is recommended to use @ExceptionHandler to handle the exception in spring
	// controller
	// this method will automatically gets executed whenever there's an exception
	// from any of the controller method.
	// called when anyone throws Exception.class exception as we have mentioned that
	// type.

	/*
	 * private void prepareList() {
	 * 
	 * 
	 * .getAllMsgs();
	 * 
	 * Message message1 = new Message(101, "MSG1"); Message message2 = new
	 * Message(102, "MSG2"); Message message3 = new Message(103, "MSG3");
	 * 
	 * msgList.add(message1); msgList.add(message2); msgList.add(message3);
	 * 
	 * }
	 */

}
