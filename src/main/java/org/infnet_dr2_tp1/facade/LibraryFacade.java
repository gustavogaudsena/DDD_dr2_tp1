package org.infnet_dr2_tp1.facade;

import org.infnet_dr2_tp1.models.Book;
import org.infnet_dr2_tp1.models.Loan;
import org.infnet_dr2_tp1.models.User;

public class LibraryFacade {
    private final Library library = Library.getInstance();

    public void addBook(Book book) {
        library.addBook(book);
    }

    public void removeBook(Book book) {
        library.removeBook(book);
    }

    public void findBook(String title) {
        library.findBook(title);
    }

    public void addUser(User user) {
        library.addUser(user);
    }

    public void removeUser(User user) {
        library.removeUser(user);
    }

    public void loanBook(Book book, User user) {
        library.loanBook(book, user);
    }

    public void returnBook(Book book, User user) {
        library.returnBook(book, user);
    }

    public boolean isLoanOverdue(Loan loan) {
        return loan.isOverdue();
    }
}
