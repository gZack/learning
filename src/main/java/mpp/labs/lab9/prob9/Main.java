package mpp.labs.lab9.prob9;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        Book book = new Book("test",3);
        List<BookCopy> copies = book.getCopies();
        copies = copies.stream().limit(2).map(bookCopy -> {
            bookCopy.changeAvailability();
            return bookCopy;
        }).collect(Collectors.toList());

        copies.forEach(e -> System.out.println(e.isAvailable()));
        System.out.println(book.isAvailable());
    }
}
