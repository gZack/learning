package mpp.labs.lab9.prob2;

import java.util.Arrays;
import java.util.stream.Stream;

public class SubStream {

    Stream<String> streamSection(Stream<String> stream, int m, int n){

        return stream.skip(m).limit(n - m + 1);
    }

    public static void main(String[] args){

        Stream<String> stringStream = Stream.of("a","b","c","d","e","f","g","h","i");

    }
}
