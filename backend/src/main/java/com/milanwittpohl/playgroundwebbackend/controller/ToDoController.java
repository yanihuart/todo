package com.milanwittpohl.playgroundwebbackend.controller;

import com.milanwittpohl.playgroundwebbackend.data.ToDo;
import com.milanwittpohl.playgroundwebbackend.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping
    public List<ToDo> findAll(){
        return toDoService.findAll();
    }

    @GetMapping("/{id}")
    public ToDo findById(@PathVariable String id){
        return toDoService.findById(id);
    }

    @PostMapping
    public ToDo create(@RequestBody ToDo toDo){
        return toDoService.save(toDo);
    }

    @PutMapping("/{id}")
    public ToDo update(@RequestBody ToDo toDo){
        return toDoService.save(toDo);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
        toDoService.deleteById(id);
    }

}