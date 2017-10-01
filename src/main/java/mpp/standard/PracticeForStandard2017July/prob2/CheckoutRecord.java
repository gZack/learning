package mpp.standard.PracticeForStandard2017July.prob2;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {

    private List<CheckoutRecordEntry> checkoutEntryList;

    public CheckoutRecord(){
        this.checkoutEntryList = new ArrayList<>();
    }

    public List<CheckoutRecordEntry> getCheckoutEntryList() {
        return checkoutEntryList;
    }

    public void addCheckoutEntry(CheckoutRecordEntry recordEntry){
        this.checkoutEntryList.add(recordEntry);
    }
}
