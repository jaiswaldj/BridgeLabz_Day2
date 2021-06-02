package com.bridgelabz;
/**
 * Java program to takes a command-line argument n and prints a
 * table of the powers of 2 that are less than or equal to 2^n.
 *
 * @Date -02/06/2021
 * @author Deepak Jaiswal
 */

public class PowerOf2 {
    public static void main(String[] args) {

        /** read in one command-line argument*/
        int n = Integer.parseInt(args[0]);

        int i = 0;                /** count from 0 to N*/
        int powerOfTwo = 1;       /** the ith power of two*/

        // repeat until i equals n
        while (i <= n) {
            System.out.println(i + " " + powerOfTwo);   /** print out the power of two*/
            powerOfTwo = 2 * powerOfTwo;                /**double to get the next one*/
            i = i + 1;
        }

    }
}
