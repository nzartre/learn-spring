package com.zartre.hexatodo.SpringApp.handler_http;

import com.zartre.hexatodo.SpringApp.model.TodoItem;
import com.zartre.hexatodo.SpringApp.handler.Handler;
import com.zartre.hexatodo.SpringApp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController implements Handler {
    @Autowired
    private TodoService todoService;

    @PostMapping("/todos")
    public TodoItem createTodo(@RequestBody TodoItem item) {
        System.out.println("HttpHandler.createTodo");
        return todoService.createTodo(item);
    }
}
