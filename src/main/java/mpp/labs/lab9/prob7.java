package mpp.labs.lab9;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prob7 {
    public static void main(String[] args){
        List<Set<String>> setList = new ArrayList<>();
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");

        setList.add(set);

        set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

        setList.add(set);

        set = new HashSet<>();
        set.add("test");
        set.add("test1");
        set.add("test2");

        setList.add(set);

        final BinaryOperator<Set<String>> addSet = (n,m)->{
            n.addAll(m);
            return n;
        };

        setList.stream()
                .flatMap(s -> s.stream())
                .reduce((x,y)->{
                   return  x + "," + y;
                }).ifPresent(System.out::println);

        setList.stream()
                    .reduce(addSet::apply)
                    .ifPresent(System.out::println);

        setList.stream()
                .reduce((x,y) -> {
                    x.addAll(y);
                    return x;
                }).ifPresent(System.out::println);


        //List<String> reduced = setList.stream()
            //    .reduce(new ArrayList<>(), (x,y)->Stream.concat(x,y),(x,y)-> x + "," + y)

        //set.stream()
                //.reduce((x,y) -> x + "," + y)
                //.ifPresent(System.out::println);

        //System.out.println(flatMap);
    }
}
