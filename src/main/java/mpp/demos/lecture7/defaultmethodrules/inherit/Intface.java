package mpp.demos.lecture7.defaultmethodrules.inherit;

public interface Intface  {
	default void myMethod(int x) {
		System.out.println(x);
	}
}
