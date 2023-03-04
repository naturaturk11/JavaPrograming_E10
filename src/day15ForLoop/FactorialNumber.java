package day15ForLoop;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        /*Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )     */

       /* Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        double number=scan.nextInt();



        int result=1;

        for (int i = (int)number; i >=1 ; i--) {
            result*=i;

        }
        System.out.println(result);*/

        int result1=1;//not equals not to 0

          //4!=4*3*2*1
        for (int l = 4; l >=1 ; l--) {
          result1*=l;
        }
        System.out.println("result1 = " + result1);


    }
}
