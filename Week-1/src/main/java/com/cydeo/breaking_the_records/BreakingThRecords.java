package com.cydeo.breaking_the_records;

import java.util.ArrayList;
import java.util.List;

public class BreakingThRecords {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static void main(String[] args) {



    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here

        List<Integer> list = new ArrayList<>();
        int currentHigh = scores.get(0);
        int currentLow = scores.get(0);
        int highCount = 0;
        int lowCount = 0;

        for (int score : scores){
            if (score > currentHigh){
                currentHigh = score;
                highCount++;
            }else if (score < currentLow){
                currentLow = score;
                lowCount++;
            }

        }

        list.add(highCount);
        list.add(lowCount);

        return list;




    }
}
