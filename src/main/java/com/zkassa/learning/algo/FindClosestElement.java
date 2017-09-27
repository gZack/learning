package com.zkassa.learning.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindClosestElement {
    public static void main(String[] args){

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        findClosestElements(list,4,3);

        //System.out.println(Collections.binarySearch(list, 6));

    }

    private static void findClosestElements(List<Integer> arr, int k, int x){
        //Collections.sort(arr, (a,b)-> a==b ? a-b : Math.abs(a-x)- Math.abs(b-x));
        Collections.sort(arr, (a,b)-> Math.abs(a-x)- Math.abs(b-x));
        //arr = arr.subList(0,k);
        System.out.println(arr);

    }
}
