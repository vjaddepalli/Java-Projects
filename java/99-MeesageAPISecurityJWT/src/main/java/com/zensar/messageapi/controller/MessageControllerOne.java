package com.zensar.messageapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zensar.messageapi.bean.Message;
import com.zensar.messageapi.dao.MessagesRepo;

@Controller
public class MessageControllerOne {
	
	@Autowired
	private MessagesRepo repo;
	
	
	@GetMapping("/messages/all")
	public String showAllMessages(Model m) {
		List<Message> all=repo.findAll();
		m.addAttribute("messages", all);
		return "messages";
	}
	
	@GetMapping("/message/delete")
	public String deleteById(@RequestParam int id) {
		System.out.println("Deleting msg with ID: "+id);
		this.repo.deleteById(id);
		return "redirect:/messages/all";
	}
	
	//this is just to show
	@GetMapping("/message/create")
	public String goToCreate(Model m) {
		System.out.println("IN CREATE");
		m.addAttribute("message",new Message());
		return "create";
	}
	
	//this to perform insertion operation in DB
	@PostMapping("/message/add")
	public String performAddMessage(@ModelAttribute Message m) {
		//ToDo to insert a record in DB;
		this.repo.save(m);
		return "redirect:/messages/all";
	}
	
	@GetMapping("/message/update")
	public String goToUpdate(@ModelAttribute Message m) {
		return "update";
	}
	
	@PutMapping("/message/doupdate")
	public String performUpdate(@ModelAttribute Message m) {
		//ToDo to insert a record in DB;
		this.repo.save(m);
		return "redirect:/messages/all";
	}
	
	
	@GetMapping("/hi")
	public String hello(Model m) {
		System.out.println("IN HELLO()");
		
		//following method has 2 args.
		//1.key-this is used in HTML to fetch value
		//2.value-
		m.addAttribute("title","Welcome to API from zensar");
		//what ever we are returning from this method is view
		//this view is in the form of HTML file
		//add HTML view must be present in->src/main/resources/templates/welcome.html
		return "welcome";
	}
}
