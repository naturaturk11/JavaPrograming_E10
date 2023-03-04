package day19_loopReview;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        while (true){
        System.out.println("Enter a number");
        int num=scan.nextInt();


        if(num%2==0){
            System.out.println("even number");
        }else{
            System.out.println("Odd number");
        }

        System.out.println("would you like to enter onother number/yes-no");
        String a=scan.next();

        if(!(a.equalsIgnoreCase("no") || a.equalsIgnoreCase("yes"))){
            System.err.println("ınvalid entry");
            System.exit(0);
        }



        if(a.equalsIgnoreCase("no")){
            break;
        }





    }





}}
