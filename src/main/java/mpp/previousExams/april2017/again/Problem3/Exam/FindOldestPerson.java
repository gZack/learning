package mpp.previousExams.april2017.again.Problem3.Exam;

import java.util.List;

//DO NOT MODIFY METHOD SIGNATURE OR STATIC QUALIFIER
public class FindOldestPerson {
	public static Person findOldestPerson(List<Person> persons) {
		//implement

		return persons.stream()
				.reduce(new Person("",0),(person, person2)
						-> person.getAge() > person2.getAge() ? person : person2);
	}
	
	
}
