package mpp.labs.lab9.prob5;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class PrintSquare {


    public static void main(String[] args){
        final IntUnaryOperator nextSquare = n ->{
          n = (int)Math.sqrt(n);
            n++;
          return n*n;
        };

        final Function<Integer,Integer> nextSquare1 = n ->{
            n++;
            return n*n;
        };

        final IntStream intStream = IntStream.iterate(1,nextSquare);
        intStream.limit(10).forEach(System.out::println);


    }
}
