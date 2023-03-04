package day17WhileDoWhile;

import java.util.Scanner;

public class SumoFnNumbers {
    public static void main(String[] args) {
    /**Write a program that calculates the sum of numbers entered
     by the user until user enters a negative number.

     hint: you need an infinite loop
*/
        Scanner an=new Scanner(System.in);



        int sum=1;


       while(true){
           System.out.println("enter a number");
           int number=an.nextInt();

           if(number<0){
               break;



           }sum*=number;



       }
        System.out.println(sum);










    }
}
