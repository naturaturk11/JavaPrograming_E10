package day17WhileDoWhile;

public class Frequency {
    public static void main(String[] args) {
       /*write a program that can returnthe frequency of aa char from a String
       str="AAABBC"
       CH='A'
        */

        String str ="BBBBBAAABBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBC";
        char ch='B';

        int frequency=0;

        for(int i=0;i<str.length();i++){//indexes of str
            char eachChar=str.charAt(i);//eachChar: each chracter of str!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

            if (ch == eachChar) {//if given is matching with the eachChar,the ch is appeared in the string
                frequency++;//İNCREASED NUMBER
                //ferquency+=1; similer to frequency++

            }

            }
        System.out.println("frequency = " + frequency);




    }
}
