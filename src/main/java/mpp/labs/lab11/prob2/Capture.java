package mpp.labs.lab11.prob2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Capture {
    public static void reverse(List<?> list){
        reverseHelper(list);
    }

    private static <T> void reverseHelper(List<T> list){
        Collections.reverse(list);
        list.forEach(System.out::println);
    }


    public static void main(String[] args){
        List<String> list = Arrays.asList("1","2","3","4");
        reverse(list);
    }
}
