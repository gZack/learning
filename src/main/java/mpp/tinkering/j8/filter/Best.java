package mpp.tinkering.j8.filter;

import java.util.List;

public class Best {

   static final WordCounterFunction<List<String>,Character,Character, Integer, Long> function
           = (list, c, d, l) -> list.stream()
                                    .filter(n -> n.contains(String.valueOf(c)))
                                    .filter(n -> !n.contains(String.valueOf(d)))
                                    .filter(n -> n.length() == l)
                                    .count();


    public static long countWords(List<String> words, char c, char d, int len){

        return function.apply(words,c,d,len);
    }
}
