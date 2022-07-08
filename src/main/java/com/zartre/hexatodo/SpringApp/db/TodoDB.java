package com.zartre.hexatodo.SpringApp.db;

import com.zartre.hexatodo.SpringApp.model.TodoItem;

/**
 * TodoDB is a driven port for a to-do database
 */
public interface TodoDB {
    TodoItem create(TodoItem item);
    TodoItem get(String id);
    TodoItem update(TodoItem item);
    void delete(String id);
}
