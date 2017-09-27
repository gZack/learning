package mpp.tinkering.unitTest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Test {
    Function<List<String>,List<String>> allToUpperCase =
            list -> list.stream()
                        .map(s -> s.toUpperCase())
                        .collect(Collectors.toList());


    public void multipleWordsToUpper(){
        List<String> input = Arrays.asList("a","b","hello");
        List<String> result = allToUpperCase.apply(input);
    }
}

