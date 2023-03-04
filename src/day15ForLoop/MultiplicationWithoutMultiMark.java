package day15ForLoop;

import java.util.Scanner;

public class MultiplicationWithoutMultiMark {
    public static void main(String[] args) {

/*
3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber= scan.nextInt();

        System.out.println("Enter second number");
        int secondNumber= scan.nextInt();

        int result=0;

        if(firstNumber<0 || secondNumber<0){
            System.out.println("invalid number");
        }
        for (int i = 0; i < secondNumber; i++) {

            result+=firstNumber;




        }
        System.out.println("multiplication= "+result);















    }
}
