package com.nogayhusrev.sparse_arrays;

import java.util.*;

public class SparseArrays {


    public static void main(String[] args) {

        String strings[] = {"ab","ab","abc"};
        String queries[] = {"ab","abc","bc"};

        System.out.println(matchingStrings(Arrays.asList(strings),Arrays.asList(queries)));

    }

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here

        Map<String, Integer> map = new LinkedHashMap<>();
        int result[] = new int[queries.size()];

        for (int i = 0; i < strings.size(); i++) {
            String inputString = strings.get(i);
            if (map.containsKey(inputString)) {
                map.put(inputString, map.get(inputString) + 1);
            } else {
                map.put(inputString, 1);
            }
        }

        for (int i = 0; i < queries.size(); i++) {
            String queryString = queries.get(i);
            if (map.containsKey(queryString)) {
                result[i] = map.get(queryString);
            }
        }


        List<Integer> list = new ArrayList<>();
        for (int i : result)
            list.add(i);

        return list;

    }


}
