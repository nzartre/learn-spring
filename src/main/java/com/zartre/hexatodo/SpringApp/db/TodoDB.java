package com.zartre.hexatodo.SpringApp.db;

import com.zartre.hexatodo.SpringApp.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TodoDB is a driven port for a to-do database
 */
public interface TodoDB extends JpaRepository<TodoItem, String> {
}
