package org.infnet_dr2_tp1.factory;

public class DVDFactory extends LibraryItemFactory {
    public DVD create() {
        return new DVD();
    }
}
