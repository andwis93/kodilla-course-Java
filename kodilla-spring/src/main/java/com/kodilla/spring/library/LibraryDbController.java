package com.kodilla.spring.library;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Scope("singleton")
public final class LibraryDbController {

    public void saveData() {
        System.out.println("Saving data to the database.");
    }

    public void loadData() {
        System.out.println("Loading data from the database");
    }
}