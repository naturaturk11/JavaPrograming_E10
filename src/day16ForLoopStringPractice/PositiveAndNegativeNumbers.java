package day16ForLoopStringPractice;

import java.util.Scanner;

public class PositiveAndNegativeNumbers {
    public static void main(String[] args) {

        /** Write a program that asks user to enter number for 5 times,
         * and print how many positive and negative numbers user entered
         Ex:
         Inputs:
         10
         20
         -1
         0
         3

         Output:
         3 positive and 1 negative*/

        Scanner scan=new Scanner(System.in);
        System.out.println("enter five numbers");



        int countPos=0;
        int countNeg=0;

        for (int i = 0; i < 5; i++) {
            int number=scan.nextInt();//!!!!!!!!!!!!!!!!!!!!!!!!!!the crucial point
            if(number<0) {
                countNeg++;
            } else if (number>0) {countPos++;

            }

        }
        System.out.println(countPos+"positive and "+countNeg+" negative");

        }





        }












