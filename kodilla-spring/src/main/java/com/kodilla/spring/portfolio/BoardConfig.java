package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean
    @Scope("prototype")
    public Board board() {
        return new Board(getToDoList(),getInProgressList(),getDoneList());
    }

    @Bean(name = "toDoList")
    @Scope("singleton")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    @Scope("singleton")
    public TaskList getInProgressList() {
        return new TaskList();
    }
    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList();
    }

}
