package day14String2;

import java.util.Scanner;

public class StringMethods_Substring {
    public static void main(String[] args) {


String d1="Cydeo Scholl";
String d2=d1.substring(0, 8);
        System.out.println("d2 = " + d2);

String STR1=d1.substring(7);
        System.out.println("STR1 = " + STR1);
        System.out.println("...................................................");



        String word2="call me back";

        String s1=word2.substring(0 ,word2.indexOf(" ") );//" Java"
        System.out.println(s1);



        String  s2=word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" ")) ;//"Programming"
        System.out.println(s2);

        String  s3=word2.substring(word2.lastIndexOf(" ")+1);//"Language"
        System.out.println(s3);







    }









        }

