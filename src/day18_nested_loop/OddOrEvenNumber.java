package day18_nested_loop;

import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String[] args) {

        /*Write a program that asks user to enter a number , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing*/

        Scanner scan=new Scanner(System.in);



       while (true) {
           System.out.println("enter a number");
           int number = scan.nextInt();

           if (number % 2 == 0) {
               System.out.println(number + " is even number");
           } else {
               System.out.println(number + " is odd number");
           }

           System.out.println("would you like to enter another number");
           String a = scan.next().toLowerCase();//noNoNO...

           while (!(a.equals("yes"))|| a.equals("no")){//if the answer is invalid
               System.err.println("PLEASE RE ENTER,would you like to enter another number");
               a = scan.next().toLowerCase();//noNoNO...
           }




           if(a.equals("no")){
               break;
           }

       }








    }
}
