package com.cydeo.mini_max_sum;

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

        miniMaxSum((List<Integer>) Arrays.asList(arr));
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long min = arr.get(0);
        long max = arr.get(0);
        long sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            min = Math.min(min, arr.get(i));
            max = Math.max(max, arr.get(i));
        }


        System.out.println((sum-max) + " " + (sum-min));
    }







}
