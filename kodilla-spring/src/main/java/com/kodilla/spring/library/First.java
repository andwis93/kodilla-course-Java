package com.kodilla.spring.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class First {
    ApplicationContext context = new AnnotationConfigApplicationContext(Library.class);
    Library libraryDbController = context.getBean(Library.class);
        public void test() {
            System.out.println(libraryDbController);
        }
}
