package com.example.todo.todoapp.controller.tasks;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class taskController {
    
    @RequestMapping("/hello")
    public String hello()
    {
        return "Hi";
    }


}
