package mpp.previousExams.april2017.again.Problem4.Exam;

import java.util.function.Function;

public interface FunctionWithException<T,R> {

    R apply(T t) throws Exception;

    public static <T,R> Function<T,R> unchecked(FunctionWithException<T,R> f){

        return x -> {
            try {
                return f.apply(x);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }
}
