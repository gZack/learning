package mpp.labs.lab7.prob5.soln;

public interface Unflyable extends Flyable {
	default void fly() {
		System.out.println("  cannot fly");
	}
}
