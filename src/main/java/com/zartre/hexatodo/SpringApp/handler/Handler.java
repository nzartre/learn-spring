package com.zartre.hexatodo.SpringApp.handler;

import com.zartre.hexatodo.SpringApp.model.TodoItem;
import org.springframework.web.bind.annotation.RequestBody;

public interface Handler {
    void createTodo(@RequestBody TodoItem item);
}
