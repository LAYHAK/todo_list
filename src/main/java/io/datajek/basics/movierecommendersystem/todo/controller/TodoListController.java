package io.datajek.basics.movierecommendersystem.todo.controller;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import io.datajek.basics.movierecommendersystem.todo.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Repository
public class TodoListController {
    private TodoListService todoListService;

    @Autowired
    public TodoListController(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    // Your code here
    @GetMapping("/")
    public String getTodoList(Model model) {
        model.addAttribute("todoList", todoListService.getAllTodos());
        return "index";
    }
    @GetMapping("/todo/search")
    public String searchTodo(@RequestParam String task, @RequestParam(required = false) Boolean isDone, Model model) {
        if (isDone == null) {
            System.out.println(task);
            model.addAttribute("todoList", todoListService.searchTodoByTask(task));
        } else if (task.isEmpty()) {
            System.out.println(isDone);
            model.addAttribute("todoList", todoListService.searchTodoByIsDone(isDone));
        } else {
            System.out.println(task + ", " + isDone);
            model.addAttribute("todoList", todoListService.searchTodoByTaskAndIsDone(task, isDone));
        }
        return "index";
    }
}
