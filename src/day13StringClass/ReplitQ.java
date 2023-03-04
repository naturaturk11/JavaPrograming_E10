package day13StringClass;

import java.util.Scanner;

public class ReplitQ {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the word");
        String word = scan.next();
        String result="";

        if(word.length()%2==0){
            result=word.substring(1,3);}
        else if (!(word.length()%2==0)) {
            result=word.substring(1,2);




        }
        System.out.println(result);
    }







    }

