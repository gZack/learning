package mpp.tinkering.j8.filter;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Better {

    final static Function<Character, Predicate<String>>
            haveC = (letter) -> name -> name.contains(String.valueOf(letter));

    final static Function<Character, Predicate<String>>
            notHaveD = (letter) -> name -> !name.contains(String.valueOf(letter));

    final static Function<Integer, Predicate<String>>
            haveLength = (len) -> name -> name.length() == len;


    public static int countWords(List<String> words, char c, char d, int len){

        return (int)words.stream()
                .filter(haveC.apply(c))
                .filter(notHaveD.apply(d))
                .filter(haveLength.apply(len))
                .count();
    }
}
