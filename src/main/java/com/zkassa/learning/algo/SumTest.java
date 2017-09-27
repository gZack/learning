package com.zkassa.learning.algo;

import java.util.HashMap;
import java.util.Map;

public class SumTest {

    public static void main(String[] args){
        //int[] nums = new int[]{2,7,6,8,9};
        int[] nums = new int[]{3,3};

        //int[] result = doublePassHashMapSum(nums,6);
        int[] result = singlePassHashMapSum(nums,6);

        System.out.println(String.format("[%d  %d]", result[0],result[1]));
    }

    private static int[] doublePassHashMapSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i],i);
        }

        int complement = 0;

        for(int i = 0; i < nums.length; i++){
            complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                return new int[]{i,map.get(complement)};
            }
        }

        throw new IllegalArgumentException("No to element solution");
    }

    private static int[] singlePassHashMapSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int complement = 0;
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i],i);
            complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                return new int[]{i,map.get(complement)};
            }
        }

        throw new IllegalArgumentException("No to element solution");
    }
}
