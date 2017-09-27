package mpp.labs.lab9.prob1;

import java.util.*;
import java.util.function.Function;

public class EmployeeInfoBetter {
	static enum SortMethod {BYNAME, BYSALARY};
	static Function<Employee, String> byName = e -> e.getName();
	static Function<Employee, Integer> bySalary = e -> e.getSalary();

	static Map<SortMethod, Pair<Function,Function>> sortTypes = new HashMap<>();

	static {
		sortTypes.put(SortMethod.BYNAME, new Pair<>(byName,bySalary));
		sortTypes.put(SortMethod.BYSALARY, new Pair<>(bySalary,byName));
	}

	public void sort(List<Employee> emps, final SortMethod method) {

		Pair<Function,Function> sortType = sortTypes.get(method);

		Collections.sort(emps, Comparator.comparing(sortType.getKey()).thenComparing(sortType.getValue()));

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
		System.out.println(emps);
	}
}
