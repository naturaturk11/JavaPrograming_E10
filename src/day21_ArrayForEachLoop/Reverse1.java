package day21_ArrayForEachLoop;

import java.util.Arrays;

public class Reverse1 {
    public static void main(String[] args) {


        char[] ch={'a','b','c','d'};
        char[]reversed=new char[ch.length];
        int j=0;
        for (int i = ch.length - 1; i >= 0; i--) {
            reversed[j++]=ch[i];


        }

        System.out.println(Arrays.toString(reversed));




    }
}
