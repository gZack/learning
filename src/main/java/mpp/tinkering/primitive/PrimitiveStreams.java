package mpp.tinkering.primitive;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {

    public static void main(String[] args){
        IntStream intStream = IntStream.range(10,20);

        IntStream.range(10,20).forEach(System.out::println);

        BigInteger bigInteger;

        Stream.iterate(BigInteger.ONE.add(BigInteger.ONE), BigInteger::nextProbablePrime).limit(2)
                .forEach(System.out::println);

        Stream<String> strings = Stream.of("aaaa","bbb","ccccc","aaaa");


        strings.collect(Collectors.summarizingInt(String::length));

        IntStream intStream1 = Stream.of("aaaa","bbb","ccccc").mapToInt(String::length);

        Stream<Integer> intStream2
                = Stream.of("aaaa","bbb","ccccc")
                .mapToInt(c -> c.length()).boxed();

        OptionalDouble av = Stream.of("aaaa","bbb","ccccc","aaaa")
                .mapToDouble(c -> c.length())
                .average();

        System.out.println(av.orElse(5));

        Supplier<Stream<Person>> personSupplier = () -> Stream.of(new Person("zack",30),
                new Person("zack",31),
                new Person("zack",31),
                new Person("zack2",32));

        Supplier<Stream<String>> stringSupplier = () -> Stream.of("aaaa","bbb","ccccc","aaaa");


        Map<String,List<String>> listMap = Stream.of("aaaa","bbb","ccccc","aaaa")
                .collect(Collectors.groupingBy(Function.identity()));

        Map<Person,List<Person>> personMap = personSupplier
                .get()
                .collect(Collectors.groupingBy(Function.identity()));

        Map<String,List<Person>> nameMap = personSupplier
                .get()
                .collect(Collectors.groupingBy(o -> o.getName()));

        Map<String,List<Person>> nameMap2 = personSupplier
                .get()
                .collect(Collectors
                        .groupingBy(o -> o.getName(),Collectors
                                .mapping(Function.identity(),Collectors.toList())));

        Map<String, Map<Integer, List<Person>>> nameMap3 =  personSupplier
                .get()
                .collect(Collectors
                        .groupingBy(o -> o.getName(), Collectors.groupingBy(o -> o.getAge())));

        Map<String,Long> mapCounting = personSupplier.get()
                .collect(Collectors.groupingBy(o -> o.getName(), Collectors.counting()));

        long noOfOccurence = stringSupplier.get()
                .filter(s -> s.equals("aaaa"))
                .count();

        stringSupplier.get()
                .toArray(x -> new String[x]);

        int x =0;

    }

    static class Person{
        private String name;
        private int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
