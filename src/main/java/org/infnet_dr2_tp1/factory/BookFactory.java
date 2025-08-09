package org.infnet_dr2_tp1.factory;

public class BookFactory extends LibraryItemFactory {
    public Book create() {
        return new Book();
    }
}
