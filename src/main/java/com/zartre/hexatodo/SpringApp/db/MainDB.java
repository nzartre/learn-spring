package com.zartre.hexatodo.SpringApp.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * MainDB is a single hub for database ports
 */
@Repository
public class MainDB {
    @Autowired
    public TodoDB todoDB;

    public MainDB(TodoDB todoDB) {
        this.todoDB = todoDB;
    }
}
