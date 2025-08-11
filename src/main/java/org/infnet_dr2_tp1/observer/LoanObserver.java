package org.infnet_dr2_tp1.observer;

import org.infnet_dr2_tp1.models.Loan;

import java.util.ArrayList;

public class LoanObserver extends EventManager<Loan>{

    public LoanObserver() {
        super();
    }

    public void checkOverdueLoans(ArrayList<Loan> loans) {
        for (Loan loan : loans) {
            if (loan.isOverdue()) {
                notifySubscribers(loan);
            }
        }
    }
}
