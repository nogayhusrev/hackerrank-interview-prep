package com.nogayhusrev.lonely_integer;

import java.util.*;

public class LonelyInteger {


    public static void main(String[] args) {

    }

    /*
     * Complete the 'lonelyInteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyInteger(List<Integer> a) {
        // Write your code here

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i : a){
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            map.putIfAbsent(i,1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet())
            if (entry.getValue() == 1)
                return entry.getKey();

        return -1;

    }
}
