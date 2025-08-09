package org.infnet_dr2_tp1.models;

import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;
    private List<Loan> loans;

    public void addBook(Book book){}
    public void removeBook(Book book){}
    public void findBook(String title){}
    public void addUser(User user){}
    public void removeUser(User user){}
    public void loanBook(Book book, User user){}
    public void returnBook(Book book, User user){}
}
