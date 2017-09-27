package mpp.labs.lab7.prob5.soln;

public interface Quackable {
	default void quack() {
		System.out.println("quacking");
	}
}
