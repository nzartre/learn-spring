package com.zartre.hexatodo.SpringApp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@Builder
@AllArgsConstructor
public class TodoItem {
    private @Id @GeneratedValue Long id;
    private String title;
    @Builder.Default
    private TodoStatus status = TodoStatus.OPEN;

    public TodoItem() {
        status = TodoStatus.OPEN;
    }
}
