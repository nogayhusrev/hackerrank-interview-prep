package com.cydeo.came_case;
import java.util.*;

public class CamelCase {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()){
            String input = scanner.nextLine();
            String output;

            switch (getOperation(input)) {
                case "S":
                    switch (getType(input)) {
                        case "M":
                            output = splitMethodName(getName(input));
                            System.out.println(output);
                            break;
                        case "V":
                            output = splitVariableName(getName(input));
                            System.out.println(output);
                            break;
                        case "C":
                            output = splitClassName(getName(input));
                            System.out.println(output);
                            break;
                        default:
                            System.out.println("Invalid Input");
                            break;
                    }
                    break;
                case "C":
                    switch (getType(input)) {
                        case "M":
                            output = combineMethodName(getName(input));
                            System.out.println(output);
                            break;
                        case "V":
                            output = combineVariableName(getName(input));
                            System.out.println(output);
                            break;
                        case "C":
                            output = combineClassName(getName(input));
                            System.out.println(output);
                            break;
                        default:
                            System.out.println("Invalid Input");
                            break;
                    }
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }

    }

    private static String splitClassName(String input) {
        String output = "";

        int prev = 0;
        int curr = 0;
        for (curr = 0; curr < input.length(); curr++) {
            if (Character.isUpperCase(input.charAt(curr))){
                output += input.substring(prev, curr) + " ";
                prev = curr;
            }
        }

        output = output.substring(1) + input.substring(prev, curr);


        return output.toLowerCase();
    }

    private static String splitVariableName(String input) {
        String output = "";

        int prev = 0;
        int curr = 0;
        for (curr = 0; curr < input.length(); curr++) {
            if (Character.isUpperCase(input.charAt(curr))){
                output += input.substring(prev, curr) + " ";
                prev = curr;
            }
        }

        output += input.substring(prev, curr);


        return output.toLowerCase();
    }

    private static String splitMethodName(String input) {
        String output = "";

        int prev = 0;
        int curr = 0;
        for (curr = 0; curr < input.length(); curr++) {
            if (Character.isUpperCase(input.charAt(curr))){
                output += input.substring(prev, curr) + " ";
                prev = curr;
            }
        }

        output += input.substring(prev, curr-2);


        return output.toLowerCase();
    }

    public static String combineMethodName(String input) {
        String output = "";
        String[] strings = input.split(" ");
        output += strings[0];
        for (int i = 1; i < strings.length; i++) {
            output = output + strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1);
        }
        output = output + "()";

        return output;

    }

    public static String combineVariableName(String input) {
        String output = "";
        String[] strings = input.split(" ");
        output += strings[0];

        for (int i = 1; i < strings.length; i++) {
            output = output + strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1);
        }


        return output;

    }

    public static String combineClassName(String input) {
        String output = "";
        String[] strings = input.split(" ");

        for (String s : strings) {

            output += s.substring(0,1).toUpperCase() + s.substring(1);
        }


        return output;

    }

    public static String getOperation(String input) {
        return input.substring(0, 1);
    }

    public static String getType(String input) {
        return input.substring(2, 3);
    }

    public static String getName(String input) {
        return input.substring(4);
    }


}