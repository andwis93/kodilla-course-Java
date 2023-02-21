package com.kodilla.spring.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class First {
    ApplicationContext context = new AnnotationConfigApplicationContext(Library.class);
    Library libraryDbController = context.getBean(Library.class);
        public void test() {
            System.out.println(libraryDbController);
//            System.out.println("AAA1: " + libraryDbController.saveToDb());
//            libraryDbController.loadFromDb("BBB");
//            System.out.println("AAA2: " + libraryDbController.saveToDb());
        }
}
