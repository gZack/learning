package mpp.quiz.prob1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		//implement

		/*for (LibraryMember member : members){
			for (CheckoutRecordEntry entry :
					member.getCheckoutRecord().getCheckoutRecordEntries()){

				if(entry.getLendingItem().equals(item)){
					phoneNums.add(member.getPhone());
				}

			}
		}*/

		/*for (LibraryMember libraryMember : members){
			if (libraryMember.contains(item)){
				phoneNums.add(libraryMember.getPhone());
			}
		}*/

		phoneNums = Arrays.stream(members)
				.filter(m -> m.contains(item))
				.map(m -> m.getPhone())
				.collect(Collectors.toList());

		Collections.sort(phoneNums);
		return phoneNums;
	}
}
