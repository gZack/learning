package mpp.labs.lab7.prob5.soln;

abstract public class Duck implements Flyable, Quackable {
	abstract public void display();
	
	public void swim() {
		System.out.println("  swimming");
	}
	public void fly(){
		System.out.println("Flying with wings on abst");
	}

}
