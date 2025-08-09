package org.infnet_dr2_tp1.facade;

import org.infnet_dr2_tp1.models.Book;
import org.infnet_dr2_tp1.models.Loan;
import org.infnet_dr2_tp1.models.User;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;
    private List<Loan> loans;
    private static Library instance;

    private Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
        loans = new ArrayList<>();
    }

    static Library getInstance() {
        if (instance == null) return new Library();
        return instance;
    }

    public void addBook(Book book) {
    }

    public void removeBook(Book book) {
    }

    public void findBook(String title) {
    }

    public void addUser(User user) {
    }

    public void removeUser(User user) {
    }

    public void loanBook(Book book, User user) {
    }

    public void returnBook(Book book, User user) {
    }
}
