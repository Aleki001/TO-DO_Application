package com.wababe.todo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
public class ToDoApplication {
    private Logger LOG = LoggerFactory.getLogger(ToDoApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(ToDoApplication.class, args);
    }



}
