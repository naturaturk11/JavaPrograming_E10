package day14String2;

import java.util.Scanner;
/**Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table*/
public class DigitsNmber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=scan.next();
        char  ch=word.charAt(0);



        if(ch>='0' && ch<='9'){
            System.out.println("First character is digit");}
        else if (ch<='z' && ch>='a'){
            System.out.println("First character is lowercase");}
        else if (ch<='Z' && ch >='A') {
            System.out.println("First character is uppercase");}
        else {
            System.out.println("First character is special character");
               if(ch==')'){
                   System.out.println("warn me");}
        }


    }


    }

