package com.zartre.hexatodo.SpringApp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TodoItem {
    /**
     * id is generated at service level when creating a new to-do item
     */
    private String id;
    private String title;
    private TodoStatus status;
}
