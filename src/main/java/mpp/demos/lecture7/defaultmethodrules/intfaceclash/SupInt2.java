package mpp.demos.lecture7.defaultmethodrules.intfaceclash;

public interface SupInt2 {
	default void myMethod(int x) {
		System.out.print(x);
	}
}
