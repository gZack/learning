package mpp.standard.PracticeForStandard2017July.prob2.Sol;

import java.util.*;

public final class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		
		for(LibraryMember member: members){
			for(CheckoutRecordEntry entry: member.getCheckoutRecord().getCheckoutEntryList()){
				if(entry.getLendingItem().equals(item)){
					phoneNums.add(member.getPhone());
					break;
				}
			}
		}
		Collections.sort(phoneNums);
		return phoneNums;
	}
}
