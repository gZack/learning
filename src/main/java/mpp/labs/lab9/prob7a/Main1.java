package mpp.labs.lab9.prob7a;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main1 {

    static final  TriFunction<List<Employee>, Double, Character, String> libFun =

            (list, aDouble, character) -> list.stream()
                                                .filter(employee -> employee.salary > aDouble)
            .filter(employee -> employee.getLastName().charAt(0) > character)
            .map(employee -> employee.getFirstName() + " " + employee.getLastName())
            .reduce((s, s2) -> s + ", " + s2).get();

    public static void main(String[] args){

        List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000));

        Optional<String> fullNames = list.stream()
                .filter(employee -> employee.salary > 100000)
                .filter(employee -> employee.getLastName().charAt(0) > 'M')
                .map(employee -> employee.getFirstName() + " " + employee.getLastName())
                .sorted()
                .reduce((s, s2) -> s + "," + s2);

        System.out.println(fullNames);

    }
}
