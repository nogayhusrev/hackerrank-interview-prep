package com.nogayhusrev.mars_exploration;

public class MarsExploration {

    public static void main(String[] args) {
        System.out.println(marsExploration("SOSSPSSQSSOR"));
    }

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
        // Write your code here

        int count = 0;
        for (int i = 0; i < s.length(); i+=3) {
            if (s.charAt(i) != 'S')
                count++;
            if (s.charAt(i + 1) != 'O')
                count++;
            if (s.charAt(i + 2) != 'S')
                count++;
        }

        return count;

    }
}
