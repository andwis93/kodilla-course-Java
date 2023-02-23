package com.kodilla.matrix.testing.forum.statistics;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@DisplayName("Statistics forum Test Suite")
@ExtendWith(MockitoExtension.class)
class StatisticsForumTestSuite
{
    @Mock
    private Statistics statisticsMock;


    private int postsCount0 = 0;
    private int commentsCount0 = 0;
    private int postsCount50 = 50;
    private int commentsCount50 = 50;
    private int postsCount100 = 100;
    private int commentsCount100 = 100;


    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTest()
    {
        System.out.println("All tests: START\n");
    }

    @AfterAll
    public static void afterAllTest()
    {
        System.out.println("All test: END");
    }

    @BeforeEach
    public void beforeEachTest()
    {
        testCounter++;
        System.out.println("Test#: " + testCounter + " just started. Good luck :)!");
    }

    @AfterEach
    public void afterEachTest()
    {
        System.out.println("Test#: " + testCounter + " was finished!\n");
    }

    private List<String> generateUsersList(int n)
    {
        List<String> usersList = new ArrayList<>();
        for (int i=0; i<n;i++)
        {
            usersList.add("user"+i);
        }
        return usersList;
    }


    @Test
    void testUserQuantityIs0()
    {

        //Given
        List<String >usersNames = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount50);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount50);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When

        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int usersNameList = statisticsCalculator.usersQuantity;
        double postPerUser = statisticsCalculator.averagePostPerUser;
        double commentPerUser = statisticsCalculator.averageCommentsPerUser;

        //Then
        Assertions.assertEquals(0, usersNameList);
        Assertions.assertEquals(0, postPerUser);
        Assertions.assertEquals(0, commentPerUser);

    }

    @Test
    void testUserQuantityIs100()
    {

        //Given
        List<String >usersNames = generateUsersList(100);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount50);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount50);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int usersNameListIs = statisticsCalculator.usersQuantity;
        double postPerUser = statisticsCalculator.averagePostPerUser;
        double commentPerUser = statisticsCalculator.averageCommentsPerUser;

        //Then
        Assertions.assertEquals(100, usersNameListIs);
        Assertions.assertEquals(0.5, postPerUser);
        Assertions.assertEquals(0.5, commentPerUser);
    }

    @Test
    void testPostsQuantityIs0()
    {
        //Given
        List<String >usersNames = generateUsersList(20);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount0);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount50);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int usersPosts = statisticsCalculator.postsQuantity;
        double postPerUser = statisticsCalculator.averagePostPerUser;
        double commentPerPost = statisticsCalculator.averageCommentsPerPost;

        //Then
        Assertions.assertEquals(0, usersPosts);
        Assertions.assertEquals(0, postPerUser);
        Assertions.assertEquals(0, commentPerPost);
    }

    @Test
    void testPostsQuantityIs100()
    {
        //Given
        List<String >usersNames = generateUsersList(20);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount100);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount50);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int usersPosts = statisticsCalculator.postsQuantity;
        double postPerUser = statisticsCalculator.averagePostPerUser;
        double commentPerPost = statisticsCalculator.averageCommentsPerPost;

        //Then
        Assertions.assertEquals(100, usersPosts);
        Assertions.assertEquals(5, postPerUser);
        Assertions.assertEquals(0.5, commentPerPost);
    }

    @Test
    void testCommentsQuantityIs0()
    {
        //Given
        List<String >usersNames = generateUsersList(20);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount100);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount0);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int usersComments = statisticsCalculator.commentsQuantity;
        double commentsPerUser = statisticsCalculator.averageCommentsPerUser;
        double commentPerPost = statisticsCalculator.averageCommentsPerPost;

        //Then
        Assertions.assertEquals(0, usersComments);
        Assertions.assertEquals(0, commentsPerUser);
        Assertions.assertEquals(0, commentPerPost);
    }

    @Test
    void testCommentsGreaterThenPosts()
    {
        //Given
        when(statisticsMock.postsCount()).thenReturn(postsCount50);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount100);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double commentPerPost = statisticsCalculator.averageCommentsPerPost;

        //Then

        Assertions.assertEquals(2, commentPerPost);
    }

    @Test
    void testCommentsLessThenPosts()
    {
        //Given
        when(statisticsMock.postsCount()).thenReturn(postsCount100);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount50);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double commentPerPost = statisticsCalculator.averageCommentsPerPost;

        //Then

        Assertions.assertEquals(0.5, commentPerPost);
    }

    @Test
    void testShowStatistics()
    {
        //Given
        List<String >usersNames = generateUsersList(40);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount100);
        when(statisticsMock.postsCount()).thenReturn(postsCount50);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        String allStatistics = statisticsCalculator.showStatistics();
        String testFraze = "Users Quantity: " + 40 + "\nPosts Quantity: " + 50 + "\nComments Quantity: "
                + 100 + "\nAverage Posts per Users: " + 1.25 + "\nAverage Comments per User: "
                + 2.5 + "\nAverage Comments per Post: " + 2.0;

        //Then
        Assertions.assertEquals(testFraze, allStatistics);
    }
}

