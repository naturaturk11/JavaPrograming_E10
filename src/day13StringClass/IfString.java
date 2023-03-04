package day13StringClass;

import java.util.Scanner;

public class IfString {
    public static void main(String[] args) {

        /**
         Write a method that asks user to enter a string.
         if the string is empty, print: string is empty
         if the string has more than 3 characters, print the last three characters
         if the string has less than or equal 3 characters, print the string itself
        */


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scan.nextLine();
         scan.close();
         String result="";
         int length=str.length();

        if(length==0){result="is empty";}
        else if (length>3) {
            int lastindex = str.length() - 1;
            result = " " + str.charAt(length - 3) + str.charAt(length - 2) + str.charAt(length - 1);
        }else { result=str;}
        System.out.println(result);

        }

    }





