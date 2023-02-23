package com.kodilla.matrix.exception.main;

import com.kodilla.matrix.exception.io.FileReader;
import com.kodilla.matrix.exception.io.FileReaderException;

public class ExceptionModuleRunner {
    public static void main(String[] args){
        FileReader fileReader = new FileReader();

        try {
            fileReader.readFile("names.txt");
        } catch (FileReaderException e){
            System.out.println("Problem while reading a file");
        }
    }
}

