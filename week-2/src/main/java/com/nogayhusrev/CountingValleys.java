package com.nogayhusrev.counting_valleys;

public class CountingValleys {

    public static void main(String[] args) {

        countingValleys(8,"UDDDUDUU");

    }

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int count = 0;
        int valleyCount = 0;
        for (char c : path.toLowerCase().toCharArray()){

            if (count == 0 && c == 'd'){
                count -= 1;
                valleyCount += 1;
            } else if (c == 'd') {
                count -= 1;
            }else{
                count += 1;
            }

        }

        return valleyCount;


    }

}
