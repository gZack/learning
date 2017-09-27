package mpp.tinkering.generics;

import java.util.Arrays;
import java.util.List;

public class MyList<T extends Comparable> {

    public long numberOfOccurences(List<T> list, T element){

        return list.stream().filter(t -> t.equals(element))
                .count();

    }

    public static void main(String[] args){
        List<String> list = Arrays.asList("a","a","b","c");
        MyList<String> myList = new MyList<>();
        System.out.println(myList.numberOfOccurences(list, "a"));
    }
}
