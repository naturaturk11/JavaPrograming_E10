package day17WhileDoWhile;

import java.util.Scanner;

public class TwoNumberMathOperator {
    public static void main(String[] args) {

        /**write a program to ask user to enter two number and math operator, and return the result.

         if the operator is invalid operator, ask user to re-enter the operator until user provides a valid
         operator (+, -, *, /)*/

        Scanner an=new Scanner(System.in);
        int num=0;
        char a='+';


         System.out.println("enter two number");
         int firstnumber=an.nextInt();
         System.out.println("enter two number");
         int secondnumber=an.nextInt();
         System.out.println("enter math operator");
        char math=an.next().charAt(0);

        while(!(math=='+'|| math=='-' || math=='/'|| math=='*')) {

            System.out.println("you entered invalid operator,please re-enter the operator");
            char math1 = an.next().charAt(0);
        }

        if((math=='+'|| math=='-' || math=='/'|| math=='*')){


            if((math=='+')){
                System.out.println(firstnumber+secondnumber);

            } else if ( math=='-') {
                System.out.println(firstnumber-secondnumber);

            } else if (math=='/') {
                System.out.println(firstnumber/secondnumber);

            }else {
                System.out.println(firstnumber*secondnumber);

            }


        }








     }



    }

