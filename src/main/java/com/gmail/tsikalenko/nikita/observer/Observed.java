package com.gmail.tsikalenko.nikita.observer;

public interface Observed {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyAllObserver();
}
