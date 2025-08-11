package org.infnet_dr2_tp1.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventManager<T>{
    private final List<EventSubscriber<T>> listeners;

    public EventManager() {
        listeners = new ArrayList<>();
    }

    public void subscribe(EventSubscriber<T> listener) {
        listeners.add(listener);
    }

    public void unsubscribe(EventSubscriber<T> listener) {
        listeners.remove(listener);
    }

    public void notifySubscribers(T data) {
        for (EventSubscriber<T> listener : listeners) {
            listener.update(data);
        };
    }
}
