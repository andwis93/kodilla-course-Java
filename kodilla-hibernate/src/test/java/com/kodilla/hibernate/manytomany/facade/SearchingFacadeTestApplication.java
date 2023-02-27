package com.kodilla.hibernate.manytomany.facade;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SearchingFacadeTestApplication {

    @Autowired
    private SearchingFacade searchingFacade;

    @Test
    void testSearchingFacade() {
        try {
            searchingFacade.processSearching("a");
        }catch (SearchingProcessingException err){
            // business exception - should be handled in real application
        }
    }
}
