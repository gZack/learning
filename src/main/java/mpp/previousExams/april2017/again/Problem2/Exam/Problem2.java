package mpp.previousExams.april2017.again.Problem2.Exam;

import mpp.previousExams.april2017.again.helperclasses.Book;
import mpp.previousExams.april2017.again.helperclasses.LibraryMember;
import mpp.previousExams.april2017.again.helperclasses.TestData;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class Problem2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Problem2 p = new Problem2();
		List<LibraryMember> members = TestData.INSTANCE.getMembers();
		p.books = TestData.INSTANCE.getAllBooks().iterator();

		Function<String, Integer> sortByLength =
				entry -> entry.length();
		Function<String, String> sortyByChar = Function.identity();


		TestData.INSTANCE.getAllEntries().stream()
				.filter(checkoutRecordEntry -> LocalDate.of(2015,06,27).equals(checkoutRecordEntry.getCheckoutDate()))
				.map(checkoutRecordEntry -> checkoutRecordEntry.getCopy().getBook().getTitle())
				.sorted(Comparator.comparing(String::length).thenComparing(s -> s))
				//.sorted(Comparator.comparing(sortByLength).thenComparing(sortyByChar))
				.forEach(System.out::println);

	}
	Iterator<Book> books;
	
	public LibraryMember detectIfWinnerDuringCheckout(List<LibraryMember> mems)  {
		return null;
		//fix this
		/*return mems.stream().filter(mem ->
		       mem.checkout(books.next().getNextAvailableCopy(), LocalDate.now(), LocalDate.of(2015, 9, 1))
		          .getCheckoutRecordEntries().size() == 10)
		    .findFirst();*/
		
		
	}
}