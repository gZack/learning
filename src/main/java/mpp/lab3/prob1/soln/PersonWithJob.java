package temp.lab3.prob1.soln;

import mpp.mpp.lab3.prob1.soln.Person;

public class PersonWithJob {

	private mpp.mpp.lab3.prob1.soln.Person person;

	private double salary;

	PersonWithJob(String name, double s) {
		this.person = new mpp.mpp.lab3.prob1.soln.Person(name);
		salary = s;
	}

	public double getSalary() {
		return salary;
	}

	public mpp.mpp.lab3.prob1.soln.Person getPerson() {
		return person;
	}

	@Override
	public boolean equals(Object aPerson) {

		if(aPerson == null) return false;

		boolean isEqual = false;

		if(aPerson instanceof mpp.mpp.lab3.prob1.soln.Person){

			isEqual =person.equals(aPerson);

		} else if (aPerson instanceof  PersonWithJob){

			PersonWithJob p = (PersonWithJob)aPerson;

			isEqual = p.person.equals(aPerson) &&
						this.getSalary()==p.getSalary();
		}

		return isEqual;
	}
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		mpp.mpp.lab3.prob1.soln.Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}
