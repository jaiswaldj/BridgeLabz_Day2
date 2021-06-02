package com.bridgelabz;
/**
 * Java program to takes a command-line argument n and prints a
 * table of the powers of 2 that are less than or equal to 2^n.
 *
 * @Date -02/06/2021
 * @author Deepak Jaiswal
 */

public class FlipCoin {
    public static void main(String[] args) {

        // Math.random() returns a value between 0.0 and 1.0
        // so it is heads or tails 50% of the time

        if (Math.random() < 0.5)
            System.out.println("Heads");
        else
            System.out.println("Tails");
    }

}
