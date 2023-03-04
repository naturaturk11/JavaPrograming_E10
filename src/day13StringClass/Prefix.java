package day13StringClass;

import java.util.Scanner;

public class Prefix {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String str = scan.next();
        System.out.println("enter a number");
        int n = scan.nextInt();
        String result="";


        if(str.substring(n).contains(str.substring(0,n))){
            result="true";

        }else {result="false";

    }
        System.out.println(result);
}}
