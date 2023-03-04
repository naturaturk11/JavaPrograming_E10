package day14String2;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {


        /**Topics: String Continue
         Loops Intro: for

         package name: day15_ForLoop

         Warmup tasks:
         1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
         Input:
         xcodex
         Output:
         acodex*/


        System.out.println("Enter a word");
      String word= new Scanner (System.in).next();//"xcodex"
        if(word.charAt(0)=='x'){word=word.replaceFirst("x" , "a");}
        System.out.println(word);
















    }}



























