package com.kodilla.patterns2;

import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaApplication {

    public static void main(String[] args) {
        //   SpringApplication.run(KodillaApplication.class, args);

        Workers w = new Workers();
        System.out.println(w.getWorker(1));
    }


}
