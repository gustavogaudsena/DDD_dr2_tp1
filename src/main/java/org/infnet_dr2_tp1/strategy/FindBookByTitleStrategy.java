package org.infnet_dr2_tp1.strategy;

import java.util.List;

public class FindBookByTitleStrategy implements FindStrategy<Book, String>{
    public Book find(String title, List<Book> books) {
        for(Book book : books) {
            if (book.getTitle().equals(title)) return book;
        }

        return null;
    }
}
