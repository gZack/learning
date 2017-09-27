package mpp.tinkering.j8.lab9.prob7b;

@FunctionalInterface
public interface TriFunction<S,T,U,R> {
	R apply(S s, T t, U u);
}
