package mpp.labs.lab7.prob5.soln;

public interface Unquackable extends Quackable {
	default void quack() {
		System.out.println("  cannot quack");
	}
}
