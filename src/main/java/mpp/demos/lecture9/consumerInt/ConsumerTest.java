package mpp.demos.lecture9.consumerInt;
import java.util.function.Consumer;

public class ConsumerTest {
 
public static void main(String[] args)
	{
		Consumer consumer = ConsumerTest::printNames;
		consumer.accept("Jeremy");
		consumer.accept("Paul");
		consumer.accept("Richard");
    } 
 
    private static void printNames(Object name) {
        System.out.println(name);
    }
}