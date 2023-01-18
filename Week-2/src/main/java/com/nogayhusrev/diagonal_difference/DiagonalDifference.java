package com.nogayhusrev.diagonal_difference;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>());
        arr.add(new ArrayList<>());
        arr.add(new ArrayList<>());
        int[] ar = {1,2,3,4,5,6,9,8,9};
        int i = 0;
        for (List<Integer> list : arr){
            list.add(ar[i++]);
            list.add(ar[i++]);
            list.add(ar[i++]);
        }

        System.out.println(arr);

        System.out.println(diagonalDifference(arr));



    }

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int leftToRight = 0;
        int rightToLeft = 0;
        for (int i = 0, j = arr.size()-1; i < arr.size(); i++, j--) {
            leftToRight += arr.get(i).get(i);
            rightToLeft += arr.get(i).get(j);
        }

        return Math.abs(leftToRight-rightToLeft);
    }
}
