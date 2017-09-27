package mpp.previousExams.april2017.problem2;


import mpp.previousExams.april2017.helperclasses.*;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Problem2 p = new Problem2();
		List<LibraryMember> members = TestData.INSTANCE.getMembers();
		p.books = TestData.INSTANCE.getAllBooks().iterator();

		Function<CheckoutRecordEntry, Integer> sortByLength =
				entry -> entry.getCopy().getBook().getTitle().length();
		Function<CheckoutRecordEntry, String> sortyByChar =
				entry -> entry.getCopy().getBook().getTitle();

		TestData.INSTANCE.getAllEntries().stream()
				.filter(entry -> entry.getCheckoutDate().equals(LocalDate.of(2015,06,27)))
				.sorted(Comparator.comparing(sortByLength)
						.thenComparing(sortyByChar))
				.map(entry -> entry.getCopy().getBook().getTitle())
				.forEach(System.out::println);

		
	}
	Iterator<Book> books;
	
	public LibraryMember detectIfWinnerDuringCheckout(List<LibraryMember> mems)  {
		return null;
		//fix this
//		return mems.stream().filter(mem -> 
//		       mem.checkout(books.next().getNextAvailableCopy(), LocalDate.now(), LocalDate.of(2015, 9, 1))
//		          .getCheckoutRecordEntries().size() == 10)
//		    .findFirst().orElse(null);
		
		
	}
}