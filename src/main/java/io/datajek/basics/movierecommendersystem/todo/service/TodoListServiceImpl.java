package io.datajek.basics.movierecommendersystem.todo.service;

import io.datajek.basics.movierecommendersystem.todo.model.Todo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoListServiceImpl implements TodoListService {
    LocalDateTime now = LocalDateTime.now();
    List<Todo> todoList = new ArrayList<>() {{
        add(new Todo(1, "Create Spring Boot Application", "Create Spring Boot Application with unit testing", false, now));
        add(new Todo(2, "Create Spring Project Packages", "Create packages for controllers, services, models, and repositories", false, now));
        add(new Todo(3, "Create Todo Model", "Create a Todo model with fields: id, task, description, done, createdAt", false, now));
    }};

    @Override
    public List<Todo> getAllTodos() {
        return todoList;
    }

    @Override
    public List<Todo> searchTodoByTask(String task) {
        return getAllTodos().stream().filter(todo -> todo.getTask().contains(task)).toList();
    }

    @Override
    public List<Todo> searchTodoByIsDone(boolean isDone) {
       return  getAllTodos().stream().filter(todo -> todo.isDone() == isDone).toList();
    }

    @Override
    public Todo getTodoById(int id) {
//        return todoList.stream().filter(todo -> todo.getId() == id).findFirst().orElse(null);
        return null;
    }

    @Override
    public void addTodo(Todo todo) {
//         todoList.add(todo);
    }

    @Override
    public void updateTodo(int id, Todo todoDetails) {
//        Todo todo = getTodoById(id);
//        todo.setTask(todoDetails.getTask());
//        todo.setDescription(todoDetails.getDescription());
//        todo.setDone(todoDetails.isDone());
    }

    @Override
    public void deleteTodoById(int id) {
//        todoList.removeIf(todo -> todo.getId() == id);
    }
}
