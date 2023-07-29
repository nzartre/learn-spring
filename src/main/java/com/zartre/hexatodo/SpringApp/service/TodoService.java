package com.zartre.hexatodo.SpringApp.service;

import com.zartre.hexatodo.SpringApp.model.TodoItem;
import com.zartre.hexatodo.SpringApp.model.TodoStatus;

public interface TodoService {
    TodoItem createTodo(TodoItem item);
    void deleteTodo(Long id);
}
