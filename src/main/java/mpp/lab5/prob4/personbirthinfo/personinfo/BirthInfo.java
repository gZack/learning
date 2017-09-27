package mpp.lab5.prob4.personbirthinfo.personinfo;

import java.time.LocalDate;

final public class BirthInfo {
	private LocalDate dateOfBirth;
	private Person person;
	BirthInfo(LocalDate dob) {
		dateOfBirth = dob;
	}

	public Person getPerson() {
		return person;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	void setPerson(Person person) {
		this.person = person;
	}
}
