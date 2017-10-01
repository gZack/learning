package mpp.standard.PracticeForStandard2017July.prob2.Sol;

import java.time.LocalDate;

public class CheckoutRecordEntry {

	private LocalDate checkoutDate;
	private LocalDate dueDate;
	private ItemType lendingItemType;
	private LendingItem lendingItem;
	
	public CheckoutRecordEntry(LendingItem lendingItem, LocalDate checkoutDate, LocalDate dueDate, ItemType lendingItemType)
	{
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
		this.lendingItemType = lendingItemType;
		this.lendingItem = lendingItem;
	}

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public ItemType getLendingItemType() {
		return lendingItemType;
	}

	public LendingItem getLendingItem() {
		return lendingItem;
	}

	
}
