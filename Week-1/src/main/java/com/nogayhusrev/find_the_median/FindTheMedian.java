package com.nogayhusrev.find_the_median;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheMedian {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 3, 4, 2, 6, 7};


        List<Integer> list = new ArrayList<>(Arrays.asList(arr));


        System.out.println("findMedian(list) = " + findMedian(list));
    }


    public static int findMedian(List<Integer> arr) {
        // Write your code here
       Collections.sort(arr);
        System.out.println("arr = " + arr);

        int medianIndex = arr.size() / 2;

        return arr.get(medianIndex);


    }

}
