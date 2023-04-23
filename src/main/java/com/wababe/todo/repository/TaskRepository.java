package com.wababe.todo.repository;

import com.wababe.todo.model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Tasks, String> {
    Tasks findById(int id);
}
