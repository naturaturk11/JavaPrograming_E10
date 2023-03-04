package day16ForLoopStringPractice;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {

        /*
        Write a program that asks user to enter a string and a char, the returns
        the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4



        */
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a String and char");
        String str=scan.nextLine();

        char ch=scan.next().charAt(0);
        int frequency=0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar=str.charAt(i);
            if(eachChar==ch){
                frequency++;

            }






    }System.out.println(frequency);
}}
