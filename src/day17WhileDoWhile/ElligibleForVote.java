package day17WhileDoWhile;

import java.util.Locale;
import java.util.Scanner;

public class ElligibleForVote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();//valid age:1-120

        while (!(age >= 1 && age <= 120)) {//while the age number is unvalid
            System.out.println("Invalid entry, please re-enter");
            age = scan.nextInt();
        }

        System.out.println("ARE YOU A US CİTİZEN?YES/NO");
        String answer = scan.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.out.println("InvaliD entry, Please re-enter");
            System.out.println("ARE YOU A US CİTİZEN?YES/NO");
            answer = scan.next().toLowerCase();

        }

        if (age >= 18 && answer.equals("yes")) {
            System.out.println("You are elligible for vote");
        } else {
            System.out.println("You ARE NOT ELIGIBLE FOR VOTE");

        }
    }
}