package day20_Array;

import utilities.ArraysUtility;

import java.util.Arrays;
import java.util.Scanner;

public class Diving {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int[]score={};

        System.out.println("enter score for judge");
        int score1=scan.nextInt();
        ArraysUtility.addElement(score,score1);

        System.out.println(Arrays.toString(score));

        }



    }

