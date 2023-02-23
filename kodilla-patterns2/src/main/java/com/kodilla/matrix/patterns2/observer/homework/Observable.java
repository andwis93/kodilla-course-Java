package com.kodilla.matrix.patterns2.observer.homework;

public interface Observable {
    void registerObserver(Observer observer);
    void notifyObserver();
    void removeObserver(Observer observer);
}
