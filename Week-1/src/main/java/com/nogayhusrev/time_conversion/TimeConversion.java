package com.nogayhusrev.time_conversion;

public class TimeConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static void main(String[] args) {

        System.out.println(timeConversion("12:45:54PM"));

    }

    public static String timeConversion(String s) {
        // Write your code here
        String amPm = s.substring(s.length()-2);
        String result = s.substring(2,s.length()-2);
        String hour = s.substring(0, 2);

        if (amPm.equals("AM")) {
            if (hour.equals("12"))
                return "00" + result;
            return s.substring(0, s.length() - 2);
        }else {

            switch (hour) {
                case "01" -> hour = "13";
                case "02" -> hour = "14";
                case "03" -> hour = "15";
                case "04" -> hour = "16";
                case "05" -> hour = "17";
                case "06" -> hour = "18";
                case "07" -> hour = "19";
                case "08" -> hour = "20";
                case "09" -> hour = "21";
                case "10" -> hour = "22";
                case "11" -> hour = "23";
                case "12" -> hour = "12";
            }

            result = hour + result;

            return result;
        }



    }

}
