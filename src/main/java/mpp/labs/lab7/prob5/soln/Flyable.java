package mpp.labs.lab7.prob5.soln;

public interface Flyable {
	default void fly() {
		System.out.println("  flying");
	}
}
