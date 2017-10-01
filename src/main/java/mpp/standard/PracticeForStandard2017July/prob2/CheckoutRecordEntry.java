package mpp.standard.PracticeForStandard2017July.prob2;

import java.time.LocalDate;

public class CheckoutRecordEntry {
    private LendingItem lendingItem;
    private ItemType itemType;
    private LocalDate checkOutDate;
    private LocalDate dudeDate;

    public CheckoutRecordEntry(final LendingItem item, final LocalDate chDate,
                               final LocalDate dueDate, final ItemType itemType){
        this.checkOutDate = chDate;
        this.dudeDate = dueDate;
        this.itemType = itemType;
        this.lendingItem = item;
    }

    public LendingItem getLendingItem() {
        return lendingItem;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public LocalDate getDudeDate() {
        return dudeDate;
    }
}
