package com.kodilla.matrix.stream.forumuser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char userSex;
    private final LocalDate userDateOfBirth;
    private final int userPostsQty;

    public ForumUser(final int userID, final String userName, final char userSex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int userPostsQty) {
        this.userID = userID;
        this.userName = userName;
        this.userSex = userSex;
        this.userDateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.userPostsQty = userPostsQty;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getUserDateOfBirth() {
        return this.userDateOfBirth;
    }

    public int getUserPostsQty() {
        return userPostsQty;
    }

    public long getAge() {

        return ChronoUnit.YEARS.between(userDateOfBirth, LocalDate.now());
    }

    public String toString(){
        return "Name: " + userName
                + "\nSex: " + "\'" + userSex + "\'\n"
                + "Date of birth: " + userDateOfBirth
                + "\nPosts: " + userPostsQty + "\n";
    }
}

