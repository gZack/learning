package mpp.labs.lab10.prob1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TDDPractice {

    public List<String> changeLastCharToUpper(List<String> words){

        return words.stream()
                .map(word -> word.substring(0,word.length() - 1)
                        + word.toUpperCase().charAt(word.length() - 1))
                .collect(Collectors.toList());
    }
}
