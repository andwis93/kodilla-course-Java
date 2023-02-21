package com.kodilla.spring.library;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("Library")
public final class Library {

    private final List<String> books = new ArrayList<>();
    private LibraryDbController libraryDbController;

    public Library(LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public Library() {
    }

    public String saveToDb() {
     return   libraryDbController.getS();
    }

    public void loadFromDb(String s) {
        libraryDbController.setS(s);
    }
}
