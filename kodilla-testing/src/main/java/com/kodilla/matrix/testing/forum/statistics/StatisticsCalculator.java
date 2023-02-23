package com.kodilla.matrix.testing.forum.statistics;

public class StatisticsCalculator {
    int usersQuantity=0;
    int postsQuantity;
    int commentsQuantity;
    double averagePostPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

    Statistics statistics;

    public StatisticsCalculator(Statistics statistics)
    {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics)
    {
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();

        double userQuantityInDouble = usersQuantity;
        double postsQuantityInDouble = postsQuantity;
        double commentsQuantityDouble= commentsQuantity;

        if ((userQuantityInDouble > 0) && (postsQuantityInDouble > 0))
        {
            averagePostPerUser= postsQuantityInDouble / userQuantityInDouble;
        } else
        {
            averagePostPerUser = 0.00;
        }

        if ((commentsQuantityDouble > 0) && (userQuantityInDouble > 0))
        {
            averageCommentsPerUser = commentsQuantityDouble / userQuantityInDouble;
        } else
        {
            averageCommentsPerUser = 0.00;
        }

        if ((postsQuantityInDouble > 0) && (commentsQuantityDouble > 0))
        {
            averageCommentsPerPost = commentsQuantityDouble / postsQuantityInDouble;
        } else
        {
            averageCommentsPerPost =0.00;
        }
    }

    public String showStatistics()
    {
        return "Users Quantity: " + usersQuantity + "\nPosts Quantity: " + postsQuantity + "\nComments Quantity: "
                + commentsQuantity + "\nAverage Posts per Users: " + averagePostPerUser + "\nAverage Comments per User: "
                + averageCommentsPerUser + "\nAverage Comments per Post: " + averageCommentsPerPost;
    }

}
