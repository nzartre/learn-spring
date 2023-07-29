package com.zartre.hexatodo.SpringApp.service;

import com.zartre.hexatodo.SpringApp.db.TodoDB;
import com.zartre.hexatodo.SpringApp.model.TodoItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    private TodoDB todoDB;

    @Override
    public TodoItem createTodo(TodoItem item) {
        return todoDB.save(item);
    }

    @Override
    public void deleteTodo(Long id) {
        todoDB.deleteById(id);
    }
}
