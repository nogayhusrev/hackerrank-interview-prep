package com.nogayhusrev.mini_max_sum;

import java.util.Arrays;
import java.util.List;

public class MiniMaxSum {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void main(String[] args) {
        Integer [] arr = {5, 5, 5, 5, 5};

        miniMaxSum( Arrays.asList(arr));
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long min = arr.get(0);
        long max = arr.get(0);
        long sum = 0;

        for (Integer integer : arr) {
            sum += integer;
            min = Math.min(min, integer);
            max = Math.max(max, integer);
        }


        System.out.println((sum-max) + " " + (sum-min));
    }







}
