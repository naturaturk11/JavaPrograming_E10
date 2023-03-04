package day42_exceptionsContinue;

import java.util.Scanner;

public class Throw_Throws {
    public static void main(String[] args) {

        System.out.println("Enter your score:");
        int score = new Scanner(System.in).nextInt();

        if (score < 0 || score > 100) {
            throw new RuntimeException("Invalid score: " + score);

        }
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }


       method1();//when selected throws keywords in code fragment, not to be called once more without compile problem

    }
public  static void method1()  {
    //Thread.sleep(5000);

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}


    }

