package org.infnet_dr2_tp1.models;

import java.util.Date;

public class Loan {
    private Book book;
    private User user;
    private Date dueDate;

    public boolean isOverdue(){
        return false;
    }
}
