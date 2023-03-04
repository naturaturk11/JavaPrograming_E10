package day14String2;

import java.util.Scanner;

public class TwoWords {

    public static void main(String[] args) {
        /*Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first word");
        String firstword1=scan.next();

        System.out.println("Enter first word");
        String secondWord1=scan.next();

        String result="";
        result=firstword1.substring(1)+secondWord1.substring(1);
        System.out.println(result);


















    }}
