package mpp.lab5.prob4.personbirthinfo.db;

import java.time.LocalDate;

public class PersonBirthRecord {
	String name;
	LocalDate dob;
	public PersonBirthRecord(String name, LocalDate dob) {
		this.name = name;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDob() {
		return dob;
	}
}
