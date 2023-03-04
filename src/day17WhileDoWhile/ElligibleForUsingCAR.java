package day17WhileDoWhile;

import java.util.Scanner;

public class ElligibleForUsingCAR {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER YOUR AGE");
        int age = scan.nextInt();

        while (!(age >= 18) && (age <= 120)) {
            System.out.println("ınvalid entry,Please re-enter your age");
            age = scan.nextInt();
        }
            System.out.println("Do YOU HAVE A VALİD DRİVİNG LİCENCE");
            String dl = scan.next().toLowerCase();

            while (!(dl.equals("yes") || dl.equals("no"))) {
                System.out.println("the response unvalid,plese re-enter");
                System.out.println("Do YOU HAVE A VALİD DRİVİNG LİCENCE");
                dl = scan.next().toLowerCase();


            }

            if ((dl.equals("yes") && age >= 18)) {
                System.out.println("Have good journey");
            } else {
                System.out.println("You are fired");
            }

        }


    }

