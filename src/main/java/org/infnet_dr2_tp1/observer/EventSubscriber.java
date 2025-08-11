package org.infnet_dr2_tp1.observer;

public interface EventSubscriber<T> {
    public void update(T data);
}
