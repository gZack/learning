package mpp.standard.PracticeForStandard2017July.prob2.Sol;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	private List<CheckoutRecordEntry> recordEntries;

	
	public CheckoutRecord() {
		recordEntries = new ArrayList<>();
	}

	public List<CheckoutRecordEntry> getCheckoutEntryList() {
		return recordEntries;
	}

	public void addCheckoutEntry(CheckoutRecordEntry entry) {
		recordEntries.add(entry);
	}

}
