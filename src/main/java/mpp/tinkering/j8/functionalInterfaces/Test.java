package mpp.tinkering.j8.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args){
        class MyRandom implements Supplier<Double> {

            @Override
            public Double get() {
                return Math.random();
            }
        }

        System.out.println(new MyRandom().get());


        BiFunction<Double,Double,List<Double>> biFunction = (x,y)->{
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x,y));
            list.add(x*y);
            return list;
        };

        System.out.println(biFunction.apply(2.0,3.0));
    }


}
