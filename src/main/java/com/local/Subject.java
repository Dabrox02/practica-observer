package com.local;

public interface Subject<T> {
    void addObserver(Observer<T> observer);

    void removeObserver(Observer<T> observer);

    void notifyObservers();
}
