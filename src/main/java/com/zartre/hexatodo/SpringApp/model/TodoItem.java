package com.zartre.hexatodo.SpringApp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Builder
@AllArgsConstructor
@Table(name = "todo_items")
public class TodoItem {
    @Id
    private String id;

    private String title;
    @Builder.Default
    private TodoStatus status = TodoStatus.OPEN;

    public TodoItem() {
        id = UUID.randomUUID().toString();
        status = TodoStatus.OPEN;
    }
}
