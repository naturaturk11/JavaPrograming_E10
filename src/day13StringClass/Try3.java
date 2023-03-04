package day13StringClass;

import java.util.Scanner;

public class Try3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String sentence=scan.nextLine();


        char firstChar=sentence.charAt(0);
        char lastChar=sentence.charAt(sentence.length()-1);
        System.out.println("firstChar = " + firstChar);
        System.out.println("lastChar = " + lastChar);













    }




}
