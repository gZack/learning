package mpp.labs.lab7.prob5;

public interface Unquackable extends Quackable {
	default void quack() {
		System.out.println("  cannot quack");
	}
}
