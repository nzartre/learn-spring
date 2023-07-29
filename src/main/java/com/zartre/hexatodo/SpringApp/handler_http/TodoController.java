package com.zartre.hexatodo.SpringApp.handler_http;

import com.zartre.hexatodo.SpringApp.model.TodoItem;
import com.zartre.hexatodo.SpringApp.handler.Handler;
import com.zartre.hexatodo.SpringApp.service.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController implements Handler {
    @Autowired
    private TodoService todoService;

    private Logger logger = LoggerFactory.getLogger(TodoController.class);

    @PostMapping("/todos")
    public TodoItem createTodo(@RequestBody TodoItem item) {
        logger.info(String.format("createTodo with body %s", item.toString()));
        return todoService.createTodo(item);
    }
}
