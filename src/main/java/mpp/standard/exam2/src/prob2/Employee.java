package mpp.standard.exam2.src.prob2;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> accounts;

	public Employee(final String name){
		this.name = name;
		this.accounts = new ArrayList<>();
	}

	public void addAccount(Account account){
		this.accounts.add(account);
	}

	public double computeUpdatedBalanceSum() {
		//implement
		return accounts.stream()
				.mapToDouble(value -> value.computeUpdatedBalance())
				.reduce(0,(left, right) -> left + right);
	}
}
