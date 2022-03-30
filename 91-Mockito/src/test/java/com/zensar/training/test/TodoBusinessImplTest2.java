package com.zensar.training.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import com.zensar.training.bean.TodoBusinessImpl;
import com.zensar.training.bean.TodoService;

public class TodoBusinessImplTest2 {

	@Test
	public void test() {
		TodoService todoService = Mockito.mock(TodoService.class);
		TodoBusinessImpl businessImpl=new TodoBusinessImpl(todoService);
		List<String> springRelatedTodos=businessImpl.retrieveTodosRelatedToSpring("user1");
		assertEquals(0, springRelatedTodos.size());
	}

}
