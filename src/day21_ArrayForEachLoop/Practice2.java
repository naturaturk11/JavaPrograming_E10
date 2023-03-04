package day21_ArrayForEachLoop;

import java.util.Arrays;

public class Practice2 {

    public static void main(String[] args) {

        String sentence="Hasan SADEBIYIK";
        char[] ch=sentence.toCharArray();
        System.out.println(Arrays.toString(ch));


        for (char c : ch) {
            System.out.print(c);
        }

    }




}
