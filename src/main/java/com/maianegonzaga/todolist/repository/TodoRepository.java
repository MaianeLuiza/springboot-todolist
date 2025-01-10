package com.maianegonzaga.todolist.repository;

import com.maianegonzaga.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
