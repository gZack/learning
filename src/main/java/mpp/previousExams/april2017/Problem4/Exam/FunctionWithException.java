package mpp.previousExams.april2017.Problem4.Exam;

import java.util.function.Function;

@FunctionalInterface
public interface FunctionWithException<T,R> {

    R apply(T t) throws Exception;

    public static <T,R> Function<T,R> unchecked(FunctionWithException<T,R> e){
        return t -> {
            try {
                return e.apply(t);
            }catch (Exception e1){
                throw new RuntimeException(e1);
            }
        };
    }
}
