package com.kodilla.matrix.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class ExerciseSubmit implements Observable{
    private final List<Observer> observersList;
    private final List<Exercise> exercisesList;
    private final String name;

    public ExerciseSubmit(String name) {
        observersList = new ArrayList<>();
        exercisesList = new ArrayList<>();
        this.name = name;
    }

    public void addExerciseForVerification(String subject) {
        exercisesList.add(new Exercise(subject));
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observersList.add(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observersList) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observersList.remove(observer);
    }

    public String getName() {
        return name;
    }

    public List<Exercise> getExercisesList() {
        return exercisesList;
    }
}
