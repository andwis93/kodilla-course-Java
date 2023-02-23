package com.kodilla.matrix.patterns.factory.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryDriving() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);

        //Then
        assertEquals("Driving",driving.getTaskName());
        assertEquals("Driving to Gotham using Bat-mobile", driving.executeTask());
        assertTrue(driving.isTaskExecuted());
    }

    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);

        //Then
        assertEquals("Painting",painting.getTaskName());
        assertEquals("Paint Bat-cave in gray", painting.executeTask());
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);

        //Then
        assertEquals("Shopping",shopping.getTaskName());
        assertEquals("Buy tires for Bat-mobile in quantity of 4.0", shopping.executeTask());
        assertTrue(shopping.isTaskExecuted());
    }

}
