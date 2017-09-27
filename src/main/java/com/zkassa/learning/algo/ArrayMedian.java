package com.zkassa.learning.algo;

public class ArrayMedian {
    public static void main(String[] args){
        //int[] nums1 = new int[]{1,3};
        //int[] nums2 = new int[]{2};

        //int[] nums1 = new int[]{1,2};
        //int[] nums2 = new int[]{3,4};

        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{2,3,4};

        System.out.println("length:" + nums1.length);

        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int x = 0,y = 0;
        int val1 , val2;
        int[] sorted = new int[nums1.length + nums2.length];
        int sortedIndex = 0;
        int size = nums1.length + nums2.length;

        while (sortedIndex < size){

            val1 = x < nums1.length ? nums1[x] : Integer.MAX_VALUE;
            val2 = y < nums2.length ? nums2[y] : Integer.MAX_VALUE;

            if(val1 <= val2 && x < nums1.length){
                sorted[sortedIndex] = val1;
                x++;
                if(x >= nums1.length && y < nums2.length){
                    sorted[++sortedIndex] = val2;
                    y++;
                }
            } else if(val2 < val1 && y < nums2.length) {
                sorted[sortedIndex] = val2;
                y++;
                if(y >= nums2.length && x < nums1.length){
                    sorted[++sortedIndex] = val1;
                    x++;
                }
            }
            sortedIndex++;
        }
        //Collections.sort(list);
        int mid = sorted.length/2;
        double ans = 0.0;

        if(sorted.length%2 == 0){
            ans = sorted[mid] + sorted[mid - 1];
            ans = ans / 2;
        } else {
          ans = sorted[mid];
        }

        return ans;
    }
}
