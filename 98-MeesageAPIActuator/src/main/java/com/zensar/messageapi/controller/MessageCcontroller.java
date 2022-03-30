package com.zensar.messageapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zensar.messageapi.entity.Message;
import com.zensar.messageapi.repository.MessageRepository;

@Controller
@RequestMapping("/message")
public class MessageCcontroller {
	
	@Autowired
	private MessageRepository repo;
	
	
	@GetMapping("/create")
	public String showCreateMessage(Model m) {
		m.addAttribute("message",new Message());
		return "create";
	}
	
	@PostMapping("/add")
	public String performAddMessage(@ModelAttribute Message m) {
		
		repo.save(m);
		return "redirect:/message/all";
	}
	
	
	@GetMapping("/all")
	public String showAllMessages(Model m) {
		List<Message> all =repo.findAll();
		System.out.println(all);
		m.addAttribute("messages", all);
		return "messages";
	}
	
	//Requestparam is used for fetching request parameters
	@GetMapping("/delete")
	public String deleteById(@RequestParam int id) {
		System.out.println("In deleteById : "+id);
		repo.deleteById(id);
		return "redirect:/message/all";
	}
	
	@GetMapping("/hi")
	public String hello(Model m) {
		System.out.println("In hello");
		
		//what ever we are returning from this method
		//this view is in the form od html file
		//and html view must be present in--->src/main/resources/templates/welcome.html
		//1-key
		//2 value
		
		m.addAttribute("title", "Welcoem to MessageAPI From Zensar");
		
		return "Welcome";
	}
	
	
	

}
