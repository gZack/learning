package mpp.tinkering.j8.comparator2;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Examples {

    /**
     * Method reference type: Class::instanceMethod
     */
    final Function<Employee, String> getName1 = (Employee e) -> e.getName();
    final Function<Employee, String> getName2 = Employee::getName;

    /**
     * Method reference type: Class::instanceMethod
     */
    final BiConsumer<Employee,String> setName1 = (Employee e,String s) -> e.setName(s);
    final BiConsumer<Employee,String> setName2 = Employee::setName;

    /**
     * Method reference type: Class::instanceMethod
     */
    final Comparator<String> comparator1 = (String s1,String s2) -> s1.compareTo(s2);
    final Comparator<String> comparator2 = String::compareTo;

    /**
     * Method reference type: Class::instanceMethod
     */
    final BiFunction<Integer, Integer, Double> pow1 = (Integer x,Integer y) -> Math.pow(x,y);
    final BiFunction<Integer, Integer, Double> pow2 = Math::pow;

    /**
     * Method reference type: Class::instanceMethod
     */
    final Function<Apple, Double> weight1 = (Apple a) -> a.getWeight();
    final Function<Apple, Double> weight2 = Apple::getWeight;

    /**
     * Method reference type: Class::staticMethod
     */
    final Function<String, Integer> parse1 = s -> Integer.parseInt(s);
    final Function<String, Integer> parse2 = Integer::parseInt;

    //type: obj::instanceMethod
    EmployeeNameComparator comp = new EmployeeNameComparator();
    Comparator<Employee> empComp1 = (e1, e2) -> comp.compare(e1,e2);
    Comparator<Employee> empComp2 = comp::compare;


    void evaluator() {

        ///test your other method references
    }

    public static void main(String[] args){
        Examples examples = new Examples();

    }

    static class Apple {
        Apple(double weight) {
            weight = 3.0;
        }
        private double weight;
        public double getWeight() {
            return weight;
        }
    }

}
