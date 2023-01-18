package com.nogayhusrev.divisible_sum_pairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairs {
    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 3, 2, 6, 1, 2};

        List<Integer> ar = new ArrayList<>(Arrays.asList(arr));

        System.out.println(divisibleSumPairs(ar.size(),3,ar));
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here

        int result = 0;

        for (int i = 0; i < ar.size() - 1; i++) {
            for (int j = i + 1; j < ar.size(); j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0 )
                    result++;
            }
        }
        return result;

    }
}
