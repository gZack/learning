package mpp.quiz.prob1;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {

    private List<CheckoutRecordEntry> checkoutRecordEntries;

    public CheckoutRecord(){
        this.checkoutRecordEntries = new ArrayList<>();
    }

    public void addCheckoutEntry(CheckoutRecordEntry recordEntry){
        checkoutRecordEntries.add(recordEntry);
    }

    public List<CheckoutRecordEntry> getCheckoutRecordEntries() {
        return checkoutRecordEntries;
    }
}
