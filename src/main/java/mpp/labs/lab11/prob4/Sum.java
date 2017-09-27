package mpp.labs.lab11.prob4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Sum {
    public static double sum(Collection<? extends Number> nums){
        double s = 0.0;
        for(Number num : nums)
            s += num.doubleValue();

        return s;

    }

    public static void main(String[] args){
        /**
         * 1
         */
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);

        List<? extends Number> nums = ints;

        double db1 = sum(nums);
        //nums.add(3.14); compiler error ? extends Number only supports get principle


        /**
         * 2
         */

        List<Object> objs = new ArrayList<>();
        objs.add(1);
        objs.add("two");
        List<? super Integer> ints2 = objs;
        ints2.add(2);
        //double db2 = sum(objs); error here
    }
}
