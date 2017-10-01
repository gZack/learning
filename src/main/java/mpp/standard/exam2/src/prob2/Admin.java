package mpp.standard.exam2.src.prob2;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		return list.stream()
				.mapToDouble(value -> value.computeUpdatedBalanceSum())
				.reduce(0, (left, right) -> left + right);

	}
}
