package com.zartre.hexatodo.SpringApp.handler_http;

import com.zartre.hexatodo.SpringApp.model.TodoItem;
import com.zartre.hexatodo.SpringApp.handler.TodoHandler;
import com.zartre.hexatodo.SpringApp.service.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
public class TodoController implements TodoHandler {
    @Autowired
    private TodoService todoService;

    private Logger logger = LoggerFactory.getLogger(TodoController.class);

    @PostMapping
    public TodoItem createTodo(@RequestBody TodoItem item) {
        logger.info(String.format("createTodo with body %s", item.toString()));
        return todoService.createTodo(item);
    }
}
