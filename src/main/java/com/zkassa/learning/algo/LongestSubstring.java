package com.zkassa.learning.algo;

import java.util.*;

public class LongestSubstring {

    public static void main(String[] args){
        //String str = "abcabcbb";
        String str = "c";
        System.out.println("Length is: " + lengthOfLongestSubstring(str));

        //int[] index = new int[128];

        //System.out.println(index[str.charAt(0)]);
    }

    public static int lengthOfLongestSubstring(String s){

        Map<Character,Integer> chars = new HashMap<>();
        int size = 0;
        for(int i=0,j =0; j < s.length(); j++){

            if(chars.containsKey(s.charAt(j))){
                i = Math.max(chars.get(s.charAt(j)),i);
            }
            size = Math.max(size,j-i +1);
            chars.put(s.charAt(j), j+1);
        }
        return size;
    }


    /*private static int longestSubstringLength(String s){

        Map<Character,Integer> chars = new HashMap<>();
        int size = 0;
        for(int i=0,j =0; j < s.length(); j++){

            if(chars.containsKey(s.charAt(j))){
                i = Math.max(chars.get(s.charAt(j)),i);
            }
            size = Math.max(size,j-1 +1);
            chars.put(s.charAt(j), j+1);
        }

    }*/


}
