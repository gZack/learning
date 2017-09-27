package mpp.labs.lab9.prob7a;

import mpp.demos.lecture8.lambdaexamples.trifunction.TriFunction;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	/**
	 * 2
	 */
	final static TriFunction<List<Employee>, Double, Character,Optional<String>>
			linFun = (list,salary,character) -> list.stream()
			.filter(e -> e.salary > salary)
			.filter(e -> e.getLastName().charAt(0) > character)
			.map(e -> e.getFirstName() + " " + e.getLastName())
			.sorted()
			.reduce((x,y) ->  x + "," + y);

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));

		//your stream pipeline here

		/**
		 * 1
		 */
		Optional<String> fullNames = list.stream()
				.filter(e -> e.salary > 100000)
				.filter(e -> e.getLastName().charAt(0) > 'M')
				.map(e -> e.getFirstName() + " " + e.getLastName())
				.sorted()
				.reduce((x,y) ->  x + "," + y);

		fullNames.ifPresent(System.out::println);

		/**
		 * 2
		 */
		linFun.apply(list,100000.0,'M').ifPresent(System.out::println);

	}
}
