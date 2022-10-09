package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ArrayOperationsTestSuite {


    @Test
    void testGetAverage(){
        //Give

        //When
        int[] setOfNumbers ={5,1,6,8,78,4,13,65,48,98,74,10,3,9,15,41,56,26,36,96};

        //Then
        double averageNumber = ArrayOperations.getAverage(setOfNumbers);
        assertEquals(34.6, averageNumber);
    }
}

