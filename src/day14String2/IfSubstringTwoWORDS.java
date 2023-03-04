package day14String2;

import java.util.Scanner;

public class IfSubstringTwoWORDS {
    public static void main(String[] args) {


    Scanner scan=new Scanner(System.in);
        System.out.println("Enter first word");
    String firstword=scan.next();

        System.out.println("Enter first word");
    String secondWord=scan.next();

    String result="";

        if(firstword.charAt(firstword.length()-1)==secondWord.charAt(0)){
        result=firstword+secondWord.substring(1);
    }else {result=firstword+secondWord;

    }
        System.out.println("result = " + result);

}}
