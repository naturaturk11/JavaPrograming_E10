package day15ForLoop;

import java.util.Scanner;

public class MaximumNumber
{
    public static void main(String[] args) {
        //write a program that asks user to enter a number for times.
        //return the maximum numbers
        Scanner scan=new Scanner(System.in);
        int max=-2147483648;//any user entered number will be greater than -2147483648


        for(int i=0;i<5;i++) {//how many times statement should be
            System.out.println("Enter any number");
            int num = scan.nextInt();
            if (num > max) {//if the user entered number is greater than current maximum number
                max = num;
            }

        }

        System.out.println("max = " + max);


    }



}
