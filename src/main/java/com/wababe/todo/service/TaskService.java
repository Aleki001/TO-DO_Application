package com.wababe.todo.service;

import com.wababe.todo.model.Tasks;
import com.wababe.todo.repository.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskService {
    private TaskRepository taskRepository;
    private Logger LOG = LoggerFactory.getLogger(TaskService.class);
    @Autowired
    public void setTaskRepository(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    //GETTING A TASK BY ID
    public Tasks getTask(int id){
        return taskRepository.findById(id);
    }

    //SAVING A TASK USING POST METHOD
    public Tasks saveTask(Tasks task){
        Tasks taskToSave;
        try{
            taskToSave = taskRepository.save(task);
            return taskToSave;
        }catch (Exception e){
            LOG.error("wrong method");
        }
        return new Tasks();
    }

    //UPDATING A TASK USING PUT METHOD
    //DELETING A TASK USING DELETE METHOD
    public void deleteTask(int id){
        Tasks foundTask = taskRepository.findById(id);
        try{
            if(foundTask != null){
                taskRepository.delete(foundTask);
            }
        }catch(Exception e){
            LOG.error("not deleted");
        }
    }


}
