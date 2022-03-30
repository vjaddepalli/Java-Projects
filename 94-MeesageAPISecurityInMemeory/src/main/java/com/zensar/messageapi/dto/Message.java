package com.zensar.messageapi.dto;

public class Message {
	
	private int id;
	private String name;
	
	public Message(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Message() {
		super();
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
