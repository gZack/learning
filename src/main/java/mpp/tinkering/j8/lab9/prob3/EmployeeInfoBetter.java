package mpp.tinkering.j8.lab9.prob3;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class EmployeeInfoBetter {
	static enum SortMethod {BYNAME, BYSALARY};
	Function<Employee, String> byName = e -> e.getName();
	Function<Employee, Integer> bySalary = e -> e.getSalary();
	
	public void sort(List<Employee> emps, final SortMethod method) {
		if(method == SortMethod.BYNAME) {
			Collections.sort(emps, Comparator.comparing(byName).thenComparing(bySalary));
		} else {
			Collections.sort(emps, Comparator.comparing(bySalary).thenComparing(byName));
		}			
	}
	
	
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Rick", 50000));
		emps.add(new Employee("Andy", 60000));
		emps.add(new Employee("Tim", 10000));
		EmployeeInfoBetter ei = new EmployeeInfoBetter();
		ei.sort(emps, SortMethod.BYNAME);
		System.out.println(emps);
		//same instance
		ei.sort(emps, SortMethod.BYSALARY);
		//System.out.println(emps);


		Map<String, Employee> map=emps.stream()
				.collect(Collectors
						.toMap(Employee::getName,Function.identity(),(x,y) -> {
							System.out.println("duplicate key found");
							return y;
						}));

		//emps.stream()
		//		.collect(Collectors.toCollection(TreeSet::new));

		int v = 0;

		Map<String, Employee> treeMap = new TreeMap<>();
		treeMap.putAll(map);

		IntSummaryStatistics statistics = emps.stream()
				.map(Employee::getName)
				.collect(Collectors.summarizingInt(value -> (int)Math.pow(value.length(),2)));

		int t = 0;
	}
}
