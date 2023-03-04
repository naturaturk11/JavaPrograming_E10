package day13StringClass;

import java.util.Locale;
import java.util.Scanner;

public class Try2 {

    public static void main(String[] args) {

        String S1 = "WE ARE THE BEST OF THE RACE";
        S1 = S1.toLowerCase();
        System.out.println(S1);

        System.out.println(".............................................");


        String a1 = "I believe that these catastrophic days will be end one day.";
        String a2 = " Everybody will learn  the truth.";
        int totalChars1 = a1.length();
        int totalChars2 = a2.length();


        if (!(a1.equals(a2))) {
            if (totalChars1>totalChars2) {
                System.out.println(totalChars1 + " is the longest string");
            } else {
                System.out.println(totalChars2 + "is the longest string.");
            }


        } else {
            System.out.println("no available result");
        }


/** write a program that asks user to enter two strings,
 write a program that asks user to enter two strings, and print out the longest string


 */


    }
}