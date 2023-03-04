package day15ForLoop;

import java.util.Scanner;

public class CatDog {
    public static void main(String[] args) {

        /*Use a `loop` to count how many times the characters
        `cat` and `dog` are found in the given String `str`. Output `true` if `cat` and `dog`
        appear the same number of times, otherwise output `false`
        */
        String animal = "catdogcatdogcatdog";
        int dogCount = 0;
        int catCount = 0;


        for (int i = 0; i <= animal.length() - 3; i++) {

        animal=animal.toLowerCase();
       String s= animal.substring(i,i+3);
       if(s.equals("cat")){
           catCount++;
       } else if (s.equals("dog")) {
           dogCount++;

       }


        }boolean result=catCount==dogCount;
        System.out.println(result);
        System.out.println("catCount = " + catCount);
        System.out.println("dogCount = " + dogCount);
    }
}