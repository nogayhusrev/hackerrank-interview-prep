package com.nogayhusrev.pangram;

public class Pangram {


    public static void main(String[] args) {

        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));

    }


    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        // Write your code here

        String str = s.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (str.indexOf(c) < 0)
                return "not pangram";
        }
        return "pangram";

    }

}
