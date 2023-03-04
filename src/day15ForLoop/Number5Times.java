package day15ForLoop;

import java.util.Scanner;

public class Number5Times {
    public static void main(String[] args) {
      /*  Write a program that asks user to enter number for 5 times,
      and print how many positive and negative numbers user entered
        Ex:
        Inputs:
        10
        20
        -1
        0
        3

        Output:
        3 positive and 1 negative*/

        int num=0;
        int positiveNum=0;
        int negativeNumber=0;

       Scanner scan=new Scanner(System.in);
        System.out.println(" enter  number five times");


        for (int i = 1; i < 6; i++) {
            int number=scan.nextInt();
            if(number>0){

                positiveNum++;
            } else if (number<0) {
                negativeNumber++;

            }
        }
        System.out.println("positiveNumbers: "+positiveNum);
        System.out.println("negativeNumbers: "+negativeNumber);



    }
}
