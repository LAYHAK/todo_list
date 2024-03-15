package io.datajek.basics.movierecommendersystem.todo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Todo {
    private int id; // Consider using a Long for larger lists
    private String task;
    private String description;
    private boolean isDone;
    private LocalDateTime createdAt;


}
