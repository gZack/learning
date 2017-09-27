package mpp.labs.lab7.prob4;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		System.out.println("\nwith consumer");
		System.out.println("-------------\n");
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s.toUpperCase());
			}
		});

		/**
		 * with lambda
		 */

		System.out.println("\nwith lambda");
		System.out.println("-----------\n");
		list.stream()
				.forEach(s -> System.out.println(s.toUpperCase()));

		/**
		 * with method reference
		 */
		System.out.println("\nwith lambda method reference");
		System.out.println("----------------------------\n");
		list.stream()
				.map(s -> s.toUpperCase())
				.forEach(System.out::println);

		Consumer<String> t = s -> System.out.println(s.toUpperCase());
		Consumer<String> t1 = System.out::println;

	}
	
	//implement a Consumer
	
	
}