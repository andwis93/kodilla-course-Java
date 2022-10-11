package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTestSuite {
    @Test
    void testBoardTodList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().getTasks().add("Added sentence to toDoList");
        String toToList  = board.getToDoList().getTasks().get(0);

        //Then
        assertEquals("Added sentence to toDoList",toToList);
    }

    @Test
    void testBoardInProgressList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getInProgressList().getTasks().add("Added sentence to inProgressList");
        String inProgressList  = board.getInProgressList().getTasks().get(0);

        //Then
        assertEquals("Added sentence to inProgressList",inProgressList);
    }

    @Test
    void testBoardDoneList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getDoneList().getTasks().add("Added sentence to doneList");
        String doneList  = board.getDoneList().getTasks().get(0);

        //Then
        assertEquals("Added sentence to doneList",doneList);
    }

}
