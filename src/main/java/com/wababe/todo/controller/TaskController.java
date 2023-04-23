package com.wababe.todo.controller;

import com.wababe.todo.model.Tasks;
import com.wababe.todo.repository.TaskRepository;
import com.wababe.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TaskController {
 private TaskRepository taskRepository;
 private TaskService taskService;

 @Autowired
    public void TaskService(TaskService taskService) {
        this.taskService = taskService;
    }

    @Autowired
    public void TaskRepository(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @RequestMapping(path="/", method = RequestMethod.GET)
    public String getAllTasks(Model model){
        model.addAttribute("tasks", taskRepository.findAll());
        return "home";
    }

    @RequestMapping(path = "/home/register", method = RequestMethod.GET)
    public String createTask(Model model){
        model.addAttribute("task", new Tasks());
        return "edit";
    }

    @RequestMapping(path = "/home", method = RequestMethod.POST)
    public String saveTask(Tasks task){
     taskRepository.save(task);

     return "redirect:/";
    }

    @RequestMapping(path = "/home/edit/{id}", method = RequestMethod.GET)
    public String updateTask(Model model, @PathVariable(value = "id") String id){
        model.addAttribute("task", taskRepository.findById(id));
        return "edit";
    }

    @RequestMapping(path = "/home/delete/{id}", method = RequestMethod.GET)
    public String deleteTask(@PathVariable(value = "id") String id){
     taskRepository.deleteById(id);
     return "redirect:/";

    }
}
