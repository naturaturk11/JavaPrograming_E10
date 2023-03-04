package day17WhileDoWhile;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        /* Write a program that can divide two positive numbers
         without using / (division) and * (multiplication) operators.
*/

   int a=20;
   int b=8;
   int count=0;

   while (a>=b){

       a-=b;
       count++;


   }
        System.out.println(count+" with a remainder "+a);











    }
}
