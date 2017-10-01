package mpp.tinkering.j8.filter;

@FunctionalInterface
public interface WordCounterFunction<T, C, D, L, R> {
    R apply(T list, C c, D d, L len);
}
