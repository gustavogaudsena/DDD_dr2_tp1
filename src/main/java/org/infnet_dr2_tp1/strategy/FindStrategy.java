package org.infnet_dr2_tp1.strategy;

import java.util.List;

public interface FindStrategy<T, U> {
    public T find(U arg, List<T> database);
}
