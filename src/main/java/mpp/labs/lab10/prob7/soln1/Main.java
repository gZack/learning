package mpp.labs.lab10.prob7.soln1;

import mpp.labs.lab10.prob7.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Stream<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000)).stream();
		
		  List<String> fullNames = emps
				    .filter(e -> (e.getSalary() > 100000))
				    .filter(e -> (e.getLastName().charAt(0) > 'M'))
				    .map(e -> fullName(e))
				    .sorted()
				    .collect(Collectors.toList());
				               
		             

	}
	
	private static String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}

	public String asString(List<Employee> employees){

		return  employees.stream().filter(e -> (e.getSalary() > 100000))
				.filter(e -> (e.getLastName().charAt(0) > 'M'))
				.map(e -> fullName(e))
				.sorted().collect(Collectors.joining(","));
	}

	public void printEmps(List<Employee> employees){
		System.out.println(asString(employees));
	}

}
