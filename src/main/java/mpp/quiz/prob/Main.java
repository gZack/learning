package mpp.quiz.prob;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){

       List<MyNumber> myNumbers = Arrays.asList(new MyNumber(1,2), new MyNumber(3,4));

       myNumbers.stream()
               .map(MyNumber::sum)
               .forEach(System.out::println);


       MyNumber myNumber = new MyNumber(1,2);


    }
}
