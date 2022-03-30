package com.zensar.training.bean;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStud implements TodoService {

	@Override
	public List<String> retrieveTodos(String user) {
		
		if(user.equals("user1"))
			return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn Dance");
		if(user.equals("user2"))
			return Arrays.asList("Learn Java", "Learn HTML", "Learn CSS");
		
		return null;
	}

}
