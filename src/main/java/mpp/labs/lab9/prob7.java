package mpp.labs.lab9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BinaryOperator;

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

        prob7 u = new prob7();
        Set<String> set1  = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");
        Set<String> set2  = new HashSet<>();
        set2.add("E");
        set2.add("F");
        set2.add("G");
        Set<String> set3  = new HashSet<>();
        set3.add("1");
        set3.add("2");
        set3.add("3");
        Set<String> set4  = new HashSet<>();
        set4.add("66");
        set4.add("77");
        set4.add("88");
        List<Set<String>> list = new ArrayList<>();
        list.add(set1);
        list.add(set2);
        list.add(set3);
        list.add(set4);
        System.out.println(u.union(list));
    }


    public static final Set<String> EMPTY_SET = new HashSet<String>();
    public Set<String> union(List<Set<String>> sets)  {
        return sets.stream().reduce(EMPTY_SET, (s, t) -> {s.addAll(t); return s;});
    }
}
