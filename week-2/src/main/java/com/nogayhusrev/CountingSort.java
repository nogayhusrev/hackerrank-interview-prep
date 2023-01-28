package com.nogayhusrev.counting_sort;

import java.util.*;

public class CountingSort {

    public static void main(String[] args) {

        System.out.println(countingSort(Arrays.asList(1,1,3,2)));

    }

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

//    public static List<Integer> countingSort(List<Integer> arr) {
//        // Write your code here
//        HashMap<Integer,Integer> map = new LinkedHashMap<>(arr.size());
//
//
//
//        for (int i = 0; i < arr.size(); i++) {
//            int number = arr.get(i);
//            if (map.containsKey(number))
//                map.put(number, map.get(number) + 1 );
//
//            map.putIfAbsent(number,1);
//        }
//
//        return new ArrayList<>(map.values());
//    }

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> list = new ArrayList<>(100);
        int[] a = new int[100];
        for (int i : arr){
            a[i] += 1;
        }

        for (int i :a)
            list.add(i);

        return list;

    }
}
