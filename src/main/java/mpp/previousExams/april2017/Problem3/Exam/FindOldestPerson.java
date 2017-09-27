package mpp.previousExams.april2017.Problem3.Exam;

import java.util.List;
import java.util.function.Function;

//DO NOT MODIFY METHOD SIGNATURE OR STATIC QUALIFIER
public class FindOldestPerson {
	public static Person findOldestPerson(List<Person> persons) {

		//implement
		return persons.stream()
				.reduce((person, person2)
						-> person.getAge() > person2.getAge() ? person : person2)
				.orElse(null);
				                        
	}
	
	
}
