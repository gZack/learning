package mpp.demos.lecture8.closures.java8;

import java.util.function.Function;

public class Employee {
	String name;
	int salary;
	public Employee(String n, int s) {
		this.name = n;
		this.salary = s;
	}

	Function<Employee, Boolean> booleanFunction = e -> this.equals(e);

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("name: ");
		sb.append(name);
		sb.append(" salary: ");
		sb.append("" + salary+">");
		return sb.toString();
		
	}

	public boolean equals(Employee employee){
		if(employee == null){
			return false;
		}

		return employee.name == name && employee.salary == salary;
	}
}

