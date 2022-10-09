package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum(){
        forumUsersList.add(new ForumUser(10001, "Bugs Bunny", 'M', 1940, 12, 30, 0));
        forumUsersList.add(new ForumUser(10002, "Homer J. Simpson", 'M', 1987, 7, 21, 784));
        forumUsersList.add(new ForumUser(10003, "Scooby-Doo", 'M', 1969, 1, 17, 0));
        forumUsersList.add(new ForumUser(10004, "Buttercup", 'F', 1998, 1, 11, 245));
        forumUsersList.add(new ForumUser(10005, "Eric Cartman", 'M', 1997, 10, 13, 69));
        forumUsersList.add(new ForumUser(10006, "Tina Belcher", 'F', 2011, 8, 14, 200));
        forumUsersList.add(new ForumUser(10007, "Scrooge McDuck", 'M', 1947, 5, 15, 0));
        forumUsersList.add(new ForumUser(10009, "Harley Quinn", 'F', 1992, 9, 28, 785));
        forumUsersList.add(new ForumUser(10010, "Johnny Bravo", 'M', 1995, 11, 20, 697));
    }

    public List<ForumUser> getForumUsersList()
    {
        return new ArrayList<>(forumUsersList);
    }

}

