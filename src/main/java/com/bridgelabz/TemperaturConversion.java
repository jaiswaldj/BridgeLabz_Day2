package com.bridgelabz;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Java program to convert Fahrenheit to Celsius (ºF to ºC) and vice-versa.
 * @Date -02/06/2021
 *
 *
 * @author Deepak Jaiswal
 */

public class TemperaturConversion {
    public static void main(String args[]) {

        Scanner cmd = new Scanner(System.in);

        /** Converting Fahrenheit to Celsius */

        System.out.println("Enter temperature in Fahrenheit :");
        float temperatue = cmd.nextFloat();
        float celsius = toCelsius(temperatue);
        System.out.printf("%.02f degree fahrenheit temperature is equal to %.02f degree celsius %n", temperatue, celsius);

        /** Converting Celsius to Fahrenheit */

        System.out.println("Enter temperature in degree celsius :");
        temperatue = cmd.nextFloat();
        float fahrenheit = toFahrenheit(temperatue);
        System.out.printf("%.02f degree celsius is equal to %.02f degree fahrenheit %n", temperatue, fahrenheit);
    }

    /**
     * Method to convert temperature from celsius to fahrenheit
     *
     * @param celsius
     * @return
     */

    public static float toFahrenheit(float celsius) {
        float fahrenheit = 9 * (celsius / 5) + 32;
        return fahrenheit;
    }

    /**
     * Converts fahrenheit temperature to celsius
     *
     * @param fahrenheit
     * @return
     */
    public static float toCelsius(float fahrenheit) {
        float celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

}
