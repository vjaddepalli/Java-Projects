package com.zensar.messageapi.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity

@Table(name="messages")
public class Message {
	
	@Id
	
	private int id;
	private String name;
	
	
	public Message() {
		super();
	}

	public Message(int id) {
		super();
		this.id = id;
	}

	public Message(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", name=" + name + "]";
	}
	
}
