package com.zartre.hexatodo.SpringApp.db_inmemory;

import com.zartre.hexatodo.SpringApp.model.TodoItem;
import org.springframework.stereotype.Repository;

@Repository
public class TodoDB implements com.zartre.hexatodo.SpringApp.db.TodoDB {
    @Override
    public TodoItem create(TodoItem item) {
        TodoItem createdItem = new TodoItem();
        createdItem.setId("1");
        createdItem.setTitle(item.getTitle());

        System.out.println("db_inmemory.TodoDB.create");
        return createdItem;
    }

    @Override
    public TodoItem get(String id) {
        TodoItem item = new TodoItem();
        item.setId(id);
        item.setTitle("test");

        System.out.println("db_inmemory.TodoDB.get");
        return item;
    }

    @Override
    public TodoItem update(TodoItem item) {
        TodoItem updatedItem = new TodoItem();
        updatedItem.setId(item.getId());
        updatedItem.setTitle(item.getTitle());
        updatedItem.setStatus(item.getStatus());

        System.out.println("db_inmemory.TodoDB.update");
        return updatedItem;
    }

    @Override
    public void delete(String id) {
        System.out.println("db_inmemory.TodoDB.delete");
    }
}
