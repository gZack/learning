package mpp.demos.lecture9.constructorref;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<String> strings
                = Arrays.asList("Eleven", "strikes", "the", "clock");

        String[] strArray = strings.stream().toArray(value -> new String[value]);
    }
}
