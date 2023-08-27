package com.zartre.hexatodo.SpringApp.handler;

import com.zartre.hexatodo.SpringApp.model.TodoItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface TodoHandler {
    TodoItem createTodo(@RequestBody TodoItem item);
    TodoItem getTodo(@PathVariable String id);
    void deleteTodo(@PathVariable String id);
}
