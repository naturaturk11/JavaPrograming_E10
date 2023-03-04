package day21_ArrayForEachLoop;

import java.util.Arrays;

public class EvenNumber {
    public static void main(String[] args) {
        /*Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
        */


       int[] numbers={1,2,3,4,5,6,7,8,9};

        int evenNumber=0;
        int oddNumber=0;

        for (int num : numbers) {
            if(num%2==0){

               evenNumber++;
            } else if (num%2!=0) {
                oddNumber++;
            }

        }
        System.out.println("oddNumber = " + oddNumber);
        System.out.println("evenNumber = " + evenNumber);







    }
}
