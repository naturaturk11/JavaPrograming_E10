package day18_nested_loop;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a=50;
        int b=7;
        int count=0;



        while (a>=b){
           a-=b;
           count++;

        }
        System.out.println(count+" with a remainder of "+a);
        System.out.println("...................................................................");

        int c=25;
        int d=8;
        int caount=0;



        while (c>=d){

            c-=d;
            caount++;


        }
        System.out.println(caount+" with a remainder "+c);//???????????);care about c is remainder not =25





      /** 1.  Write a program that can divide two positive numbers without using / (division) and * (multiplication) and % operators

       20 / 6 ==> 3 with the reaminder of 2


       a = 20
       b = 6;


       a -= b;  // a = 14
       a -= b;  // a = 8
       a -= b;  // a = 2


       x = 100;
       y = 8;

       while(a >= b){
       a -= b;
       count++;
       }





       */





       }
}
