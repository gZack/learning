package mpp.demos.lecture8.exercise.employeecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee("John", 10000);
		Employee e2 = new Employee("John", 20000);

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);

		employees.stream()
				.sorted((a,b) -> a.name.compareToIgnoreCase(b.name))
				.sorted(Comparator.comparing(Employee::getName));
		/*employees.stream()
				.max(Comparator.comparing());*/

		List<String> strs = Arrays.asList("Test1","Test2","Test3","Test4");
		String consumer = "";
		strs.stream()
				.max(String::compareToIgnoreCase)
				.get();



		System.out.println("Are they equal according to equals? " + e1.equals(e2));
		EmployeeNameComparatorGood comparator = new EmployeeNameComparatorGood();
		System.out.println("Are they equal according to the Comparator? " 
				+ (comparator.compare(e1, e2) == 0));

	}

}
