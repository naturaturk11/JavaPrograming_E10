package day13StringClass;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Try5 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String string= scan.nextLine();
        scan.close();

        String a="tablet";
        int totalChars=a.length();
        char lastChar=a.charAt(a.length()-1);
        char lastChar1=a.charAt(a.length()-2);
        char lastChar2=a.charAt(a.length()-3);


        System.out.println("totalChars = " + totalChars);
        System.out.println("lastChar2 = " + lastChar2);
        System.out.println("lastChar1 = " + lastChar1);
        System.out.println("lastChar = " + lastChar);
        System.out.println(lastChar+lastChar1+lastChar2);

        }

    }









