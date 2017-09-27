package mpp.labs.lab7.prob5.soln;

public interface Squeakable extends Quackable {
	default void quack() {
		System.out.println("   squeaking");
	}
}
