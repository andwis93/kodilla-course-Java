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

    @Test
    void testBoardScope() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        Board board2 = context.getBean(Board.class);

        //When & Then
        board.getToDoList().getTasks().add("Enter first to do list");
        board.getDoneList().getTasks().add("Enter first done list");
        board2.getToDoList().getTasks().add("Enter second to do list");
        board2.getDoneList().getTasks().add("Enter second done list");

        System.out.println(board2.getToDoList().getTasks());
        System.out.println(board2.getDoneList().getTasks());
        }

}
