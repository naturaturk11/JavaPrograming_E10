package day21_ArrayForEachLoop;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str="Java";
        System.out.println("str.charAt(1) = " + str.charAt(1));
        char[] chars=str.toCharArray();
        System.out.println(Arrays.toString(chars));

        for( char each:chars){
            System.out.print(each+" ");
        }

        System.out.println("....................................................................");

        String sentence="Wooden Spoon";
        String[] words=sentence.split(" ");


        System.out.println(Arrays.toString(words));



        String email="hasan11@gmail.com";
        String[] words1=email.split("@");
        System.out.println(Arrays.toString(words1));


        System.out.println("..........................................................");






        String s="the number. you have called. Call me. back on time";
        String[] word=s.split("\\. " );//with dot \\should be used only for split method
        System.out.println(Arrays.toString(word));




    }
}
