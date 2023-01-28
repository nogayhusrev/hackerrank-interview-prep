package com.nogayhusrev.flipping_bits;

public class FlippingBits {

    /*
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long flippingBits(long n) {
        // Write your code here


        long unsignedNumber = ~n & 0xffffffffL;
        return unsignedNumber;
    }

}
