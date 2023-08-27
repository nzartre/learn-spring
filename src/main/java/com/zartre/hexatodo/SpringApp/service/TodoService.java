package com.zartre.hexatodo.SpringApp.service;

import com.zartre.hexatodo.SpringApp.exception.NotFoundException;
import com.zartre.hexatodo.SpringApp.model.TodoItem;

public interface TodoService {
    TodoItem createTodo(TodoItem item);
    TodoItem getTodo(String id) throws NotFoundException;
    void deleteTodo(String id) throws NotFoundException;
}
