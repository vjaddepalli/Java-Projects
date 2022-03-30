package com.zensar.training.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;

import com.zensar.training.bean.TodoBusinessImpl;
import com.zensar.training.bean.TodoService;
import com.zensar.training.bean.TodoServiceStud;

public class TodoBusinessImplTest {
	
	@Test
	public void test() {
		TodoService todoService=new TodoServiceStud();
		TodoBusinessImpl todoBusinessImpl=new TodoBusinessImpl(todoService);
		List<String> springRelatedTodos=todoBusinessImpl.retrieveTodosRelatedToSpring("user1");
		assertEquals(2, springRelatedTodos.size());
		List<String> springRelatedTodos1=todoBusinessImpl.retrieveTodosRelatedToSpring("user2");
		assertEquals(0, springRelatedTodos1.size());
		
	}

}
