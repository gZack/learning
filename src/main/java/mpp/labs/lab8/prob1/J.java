package mpp.labs.lab8.prob1;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class J {
    /**
     * i
     */
    final static Supplier<Double> doubleSupplier = () -> Math.random();

    public static void main(String[] args){

        /**
         * ii
         */
        Stream.generate(doubleSupplier).limit(10).forEach(System.out::println);

        /**
         * iii
         */
        class MySupplier implements Supplier<Double>{

            @Override
            public Double get() {
                return Math.random();
            }
        }
        MySupplier mySupplier = new MySupplier();
        Stream.generate(new MySupplier()).limit(10).forEach(System.out::println);
    }
}
