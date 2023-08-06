package com.zartre.hexatodo.SpringApp.httphandler;

import com.zartre.hexatodo.SpringApp.exception.NotFoundException;
import com.zartre.hexatodo.SpringApp.model.TodoItem;
import com.zartre.hexatodo.SpringApp.handler.TodoHandler;
import com.zartre.hexatodo.SpringApp.service.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/todos")
public class TodoHttpHandler implements TodoHandler {
    @Autowired
    private TodoService todoService;

    private final Logger logger = LoggerFactory.getLogger(TodoHttpHandler.class);

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TodoItem createTodo(@RequestBody TodoItem item) {
        logger.info(String.format("createTodo with body %s", item.toString()));
        return todoService.createTodo(item);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        logger.info(String.format("deleteTodo id: %s", id));
        try {
            todoService.deleteTodo(id);
        } catch (NotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
