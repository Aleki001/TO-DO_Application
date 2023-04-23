package com.wababe.todo.boot;

import com.wababe.todo.model.Tasks;
import com.wababe.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private TaskRepository taskRepository;

    @Autowired
    public void TaskRepository(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Tasks task1 = new Tasks();
        task1.setSubject("Go to school and finish the project");
        task1.setStartDate("13/12/2022");
        task1.setEndDate("14/12/2022");
        taskRepository.save(task1);

        Tasks task2 = new Tasks();
        task2.setSubject("Go studio and record an album");
        task2.setStartDate("1/1/2023");
        task2.setEndDate("1/1/2023");
        taskRepository.save(task2);

        Tasks task3 = new Tasks();
        task3.setSubject("Prom day with my girlfriend");
        task3.setStartDate("25/12/2022");
        task3.setEndDate("26/12/2022");
        taskRepository.save(task3);

    }
}
