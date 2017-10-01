package mpp.labs.lab9.prob8;

import mpp.demos.lecture8.lambdaexamples.trifunction.TriFunction;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

	final static TriFunction<List<Employee>, Double, Character,Long>
			linFun = (list,salary,character) -> list.stream()
			.filter(e -> e.salary > salary)
			.filter(e -> e.getLastName().charAt(0) > character)
			.count();

	final static TriFunction<List<Employee>, Double, Character,Optional<String>>
			linFun1 = (list,salary,character) -> list.stream()
			.filter(e -> e.getFirstName().charAt(0) < character && e.salary > salary)
			.map(e -> e.getFirstName() + " " + e.getLastName())
			.map(String::toUpperCase)
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
		
		//print the number of Employees in list whose salary > 100000 and whose last name begins
		//with a letter that comes after the letter 'E'

		System.out.println(linFun.apply(list, 10.0, 'E'));

		//print a list of sorted full names - all upper case -- of Employees with
		//salary > 85000 and whose first name begins with a letter that comes before  the letter 'R'

		linFun1.apply(list, 85000.0, 'R').ifPresent(System.out::println);

	}

}
