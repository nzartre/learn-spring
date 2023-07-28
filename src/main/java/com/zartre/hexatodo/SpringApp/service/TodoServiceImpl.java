package com.zartre.hexatodo.SpringApp.service;

import com.zartre.hexatodo.SpringApp.db.TodoDB;
import com.zartre.hexatodo.SpringApp.model.TodoItem;
import com.zartre.hexatodo.SpringApp.model.TodoStatus;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {

    private final TodoDB todoDB;

    public TodoServiceImpl(TodoDB todoDB) {
        this.todoDB = todoDB;
    }

    @Override
    public TodoItem createTodo(TodoItem item) {
        return todoDB.save(item);
    }

    @Override
    public void deleteTodo(String id) {
    }

    @Override
    public void changeTodoStatus(String id, TodoStatus status) {
    }
}
