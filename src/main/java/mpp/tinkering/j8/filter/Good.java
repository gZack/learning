package mpp.tinkering.j8.filter;

import java.util.List;

public class Good {

    public static int countWords(List<String> words, char c, char d, int len){

        return (int)words.stream()
                .filter(name -> name.contains(String.valueOf(c)))
                .filter(name -> !name.contains(String.valueOf(d)))
                .filter(name -> name.length() == len)
                .count();
    }
}
