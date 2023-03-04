package day15ForLoop;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {


        String b = "bybybyby";

        int frequency = 0;

        while (b.contains("by")) {
            b = b.replaceFirst("by", "");
            frequency++;


        }
        System.out.println(frequency);


    }}

