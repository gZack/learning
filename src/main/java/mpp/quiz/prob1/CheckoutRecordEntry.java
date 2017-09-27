package mpp.quiz.prob1;

import java.time.LocalDate;

public class CheckoutRecordEntry {

    private LocalDate checkoutDate;
    private LocalDate dueDate;
    private LendingItem lendingItem;
    private ItemType itemType;

    public CheckoutRecordEntry(final LendingItem item, LocalDate checkoutDate,
                               LocalDate dueDate, ItemType itemType){
        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
        this.lendingItem = item;
        this.itemType = itemType;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public LendingItem getLendingItem() {
        return lendingItem;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
}
