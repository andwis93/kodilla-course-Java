package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(ExerciseSubmit exerciseSubmit) {
        System.out.println(username + " - New exercise was submitted by " + exerciseSubmit.getName() + "\n" +
                "(total: " + exerciseSubmit.getExercisesList().size() + " exercises)");
        for (Exercise e : exerciseSubmit.getExercisesList()) {
            System.out.println("- \"" + e.getSubject() + "\" - Posting date: (" + e.getPostDate() + ") - Status: " + e.isAccepted());
        }
        System.out.println();
        updateCount++;
    }

    public void acceptExercise(ExerciseSubmit exerciseSubmit, String exercise){
        for(Exercise e : exerciseSubmit.getExercisesList()) {
            if (e.getSubject().equals(exercise)) {
                e.acceptingExercise();
            }
        }
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
