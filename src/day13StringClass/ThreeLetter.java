package day13StringClass;

import java.util.Scanner;

public class ThreeLetter {
    public static void main(String[] args) {

        /**
         write a program that asks the user enter a three letter word. Check if the middle
         character of the given word is 'a'. In the case it is print:
         "Cool word", but in the case the middle letter is not 'a' print: "Okay word".
         - If the user does not enter a 3 letter word tell them:
         If the word is less than 3 letters: "Word is too short"
         If the word is too long: "Word is too long"

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three letters");
        String letters = scan.next();
        scan.close();

        String result = "";
        char a='a';
        if (letters.length() == 3) {
            if (letters.charAt(1) == 'a') {
                result = "Cool Word";
            }


        } else {
            if (letters.length() > 3) {
                result = " Word is too long";
            } else {
                result = "Word is too short";
            }


        }

        System.out.println("result = " + result);




    }}
