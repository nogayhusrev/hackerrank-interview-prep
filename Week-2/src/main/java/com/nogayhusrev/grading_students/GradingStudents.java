package com.nogayhusrev.grading_students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {


    public static void main(String[] args) {

        System.out.println(gradingStudents(Arrays.asList(4, 73, 67, 38, 33)));

    }

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here

        List<Integer> new_grades = new ArrayList<>();

        for (int i = 0; i < grades.size(); i++) {
            int grade = grades.get(i);

            if (grade < 38) {
                new_grades.add(grade);
                continue;
            }

            int temp = grade % 10;
            int new_grade = grade;

            if (temp >= 3 && temp < 5) {
                new_grade = grade + (5 - temp);
            } else if (temp > 7) {
                new_grade = grade + (10 - temp);
            }

            new_grades.add(new_grade);
        }

        return new_grades;
    }

}
