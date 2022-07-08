package com.zartre.hexatodo.SpringApp.service;

import com.zartre.hexatodo.SpringApp.db.MainDB;
import com.zartre.hexatodo.SpringApp.model.TodoItem;
import com.zartre.hexatodo.SpringApp.model.TodoStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    private MainDB db;

    @Override
    public void createTodo(TodoItem item) {
        item.setId("1");
        this.db.todoDB.create(item);
    }

    @Override
    public void deleteTodo(String id) {
        this.db.todoDB.delete(id);
    }

    @Override
    public void changeTodoStatus(String id, TodoStatus status) {
        TodoItem item = new TodoItem();
        item.setId(id);
        item.setStatus(status);
        this.db.todoDB.update(item);
    }

    @Override
    public TodoItem getTodo(String id) {
        return this.db.todoDB.get(id);
    }
}
