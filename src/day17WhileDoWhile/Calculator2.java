package day17WhileDoWhile;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=scan.nextInt();

        System.out.println("Please enter second number");
        int num2=scan.nextInt();

        System.out.println("Please enter math operator");
        char ch=scan.next().charAt(0);




        while (!(ch=='+'||ch=='-'||ch=='*'||ch=='/')){
            System.err.println("You entered invalid mark");
            System.err.println("please check the mark you entered");
            System.out.println("Please enter math operator");
            ch =scan.next().charAt(0);



        }

        System.out.println((ch=='+')?num1+num2 :(ch=='-')? num1-num2 :(ch=='*')? num1*num2 :num1/num2);




    }
}
