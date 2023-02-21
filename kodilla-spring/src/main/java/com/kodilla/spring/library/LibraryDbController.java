package com.kodilla.spring.library;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public final class LibraryDbController {

    private String s = "AAA";

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

        public void saveData() {
        System.out.println("Saving data to the database.");
    }

    public void loadData() {
        System.out.println("Loading data from the database");
    }
}