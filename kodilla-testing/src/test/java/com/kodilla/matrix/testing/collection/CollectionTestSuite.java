package com.kodilla.matrix.testing.collection;


import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite
{

    @BeforeEach
    public  void before()
    {
        System.out.println("Test case list: BEGIN");
    }

    @AfterEach
    public  void after()
    {
        System.out.println("Test case list: END\n");
    }

    @BeforeAll
    public static void beforeAll()
    {
        System.out.println("Test suite: BEGIN\n");
    }

    @AfterAll
    public static void afterAll()
    {
        System.out.println("Test suite: END\n");
    }


    @DisplayName("When list is empty " +
            "exterminate method should return empty list")
    @Test
    void testOddNumbersExterminatorEmptyList()
    {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(emptyList);

        //Then
        Assertions.assertEquals(emptyList, result);
    }

    @DisplayName("When receives list with numbers  " +
            "exterminate method should return only even numbers")

    @Test
    void testOddNumbersExterminatorNormalList()
    {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        Integer[] listWithNumbers = new Integer[]{1,2,3,4,5,6,7,8,9};

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(Arrays.asList(listWithNumbers));

        //Then
        Integer[] evenNumbers = new Integer[]{2,4,6,8};
        Assertions.assertEquals(Arrays.asList(evenNumbers), result);
    }

}

