package com.local;

public interface Observer<T> {
    void update(String eventName, T eventData);
}
