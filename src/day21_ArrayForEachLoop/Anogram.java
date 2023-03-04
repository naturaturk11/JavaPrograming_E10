package day21_ArrayForEachLoop;

import java.util.Arrays;

public class Anogram {
    public static void main(String[] args) {

        String str1="acbd";//care these are not arrays
        String str2="dbca";

        //write a program that can check if str1 and str2 build out same characters

        char[] ch1=str1.toCharArray();//this is way of creating array by using char array
        char[] ch2=str2.toCharArray();

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean anagram=Arrays.equals(ch1,ch2);
        System.out.println("anagram = " + anagram);



    }
}
