package com.nogayhusrev.plus_minus;

import java.util.*;

public class PlusMinus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void main(String[] args) {
        Integer [] arr = {-4, 3, -9, 0, 4};

        plusMinus((List<Integer>) Arrays.asList(arr));
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        int positives = 0;
        int negatives = 0;
        int zeros = 0;

        for (int i : arr){
            if (i < 0)
                negatives++;
            else if (i == 0)
                zeros++;
            else
                positives++;
        }

        double ratioPositives = (double) positives/arr.size();
        double ratioNegatives = (double) negatives/arr.size();
        double ratioZeros = zeros != 0 ? (double) zeros/arr.size() : 0;



        System.out.format("%f\n",ratioPositives);
        System.out.format("%f\n",ratioNegatives);
        System.out.format("%f\n",ratioZeros);



    }

}

