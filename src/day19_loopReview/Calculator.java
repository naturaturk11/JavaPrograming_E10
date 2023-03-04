package day19_loopReview;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int num1=scan.nextInt();


        System.out.println("Enter a math operator");
        char oerator=scan.next().charAt(0);

        if(!(oerator=='+' || oerator=='-')){
            System.err.println("ınvalid math oprator :"+oerator);
            System.exit(0);//terminates whole program
        }                        //once the exit statemnt is asked ,it means no more chance but only exit




        System.out.println(" Enter second number");
        int num2=scan.nextInt();

        if(oerator=='-'){
            System.out.println(num1-num2);
        }else{
            System.out.println(num1+num2);
        }











    }
}
