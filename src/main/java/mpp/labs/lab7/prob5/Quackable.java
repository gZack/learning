package mpp.labs.lab7.prob5;

public interface Quackable {
	default void quack() {
		System.out.println("  quacking");
	}
}
