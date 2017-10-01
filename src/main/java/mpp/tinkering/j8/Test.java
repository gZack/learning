package mpp.tinkering.j8;


import mpp.tinkering.j8.filter.Best;
import mpp.tinkering.j8.filter.Better;
import mpp.tinkering.j8.filter.Good;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {

    public static void main(String[] args){
        List<String> names = Arrays.asList("zacks", "zakma","test");

        System.out.println(Good.countWords(names,'z','c',5));
        System.out.println(Better.countWords(names,'z','c',5));
        System.out.println(Best.countWords(names,'z','c',5));

        Map<String, Employee> map = new HashMap<>();

        map.put("zack",new Employee("Test", 2000.0));
        map.put("zack1",new Employee("Test1", 3000.0));
        map.put("zack2",new Employee("Test2", 4000.0));

        Map<String, Double> salaryMap = map.keySet().stream()
                .map(s -> (Employee)map.get(s))
                .collect(Collectors.toMap(o -> o.getName(), o -> o.getSalary()));

        DoubleSummaryStatistics statistics =
        map.keySet()
                .stream()
                .map(value -> value.length())
                .collect(Collectors.summarizingDouble(value -> value));

        Set<String> keySet = map.keySet();

        keySet.stream()
                .collect(Collector.of(() -> new ArrayList<>()
                        , (objects, o) -> objects.add(o), (objects, objects2) -> {
                    objects.addAll(objects2);
                    return objects;
                        }));
        int x= 0;


        IntStream intStream = IntStream.range(0,10);

        System.out.println(map.keySet()
                .stream()
                .mapToInt(value -> value.length())
                .summaryStatistics()
                .getMin());


        Supplier<Double> randomSupplier = Math::random;

        System.out.println(randomSupplier.get());

        Collector.of(() -> new StringJoiner(" | "),
                        (stringJoiner, o) -> stringJoiner.add((String)o),
                        (stringJoiner, stringJoiner2) -> stringJoiner.merge(stringJoiner2));

        /*Collector.of(TreeSet::new,
                (o, o2) -> o.add(o2),
                (objects, objects2) -> objects.addAll(objects2))*/


    }

    static class Employee{
        private String name;
        private Double salary;
        public Employee(String name, Double salary){
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public Double getSalary() {
            return salary;
        }
    }
}


