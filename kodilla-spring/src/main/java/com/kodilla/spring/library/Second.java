package com.kodilla.spring.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Second {
    ApplicationContext context = new AnnotationConfigApplicationContext(Library.class);
    Library libraryDbController = context.getBean(Library.class);
    public void test() {
        System.out.println(libraryDbController);
//        System.out.println("BBB1: " + libraryDbController.saveToDb());
//        libraryDbController.loadFromDb("CCC");
//        System.out.println("BBB2: " + libraryDbController.saveToDb());
    }
}
