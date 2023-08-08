package com.zartre.hexatodo.SpringApp.service;

import com.zartre.hexatodo.SpringApp.db.TodoDB;
import com.zartre.hexatodo.SpringApp.exception.NotFoundException;
import com.zartre.hexatodo.SpringApp.model.TodoItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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
    public void deleteTodo(String id) throws NotFoundException {
        try {
            todoDB.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new NotFoundException("not found", e);
        }
    }
}
