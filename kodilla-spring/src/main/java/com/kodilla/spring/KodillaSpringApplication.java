package com.kodilla.spring;

import com.kodilla.spring.library.First;
import com.kodilla.spring.library.Second;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(KodillaSpringApplication.class, args);
First first = new First();
first.test();
Second second = new Second();
second.test();
First first2 = new First();
first2.test();
    }
}
