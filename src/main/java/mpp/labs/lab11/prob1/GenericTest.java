package mpp.labs.lab11.prob1;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args){
        List<Integer> ints1 = new ArrayList<>();
        ints1.add(1);
        ints1.add(2);
        ints1.add(3);

        /**
         * error
         * List<Integer> is not List<Number>
         */
        //List<Number> numbers = ints;

        List<Integer> ints2 = new ArrayList<>();
        ints2.add(1);
        ints2.add(2);
        ints2.add(3);

        /**
         * no error
         * List<Integer> is type of List<? extends Number>
         */
        List<? extends Number> numbers = ints2;
    }
}
