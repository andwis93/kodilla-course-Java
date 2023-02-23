package com.kodilla.matrix.patterns2.observer.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Exercise {
    private final String subject;
    private final LocalDate postDate;
    private boolean accepted;

    public Exercise(String subject) {
        this.postDate = LocalDate.now();
        this.subject = subject;
        this.accepted = false;
    }

    public String getSubject() {
        return subject;
    }

    public void acceptingExercise() {
        this.accepted = true;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public LocalDate getPostDate() {
        return postDate;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise exercise = (Exercise) o;
        return Objects.equals(subject, exercise.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject);
    }

    @Override
    public String toString() {
        return  "- \"" + subject +"\"" +
                " - Post Date: (" + postDate +
                ") - Status: " + accepted + "\n";
    }
}
