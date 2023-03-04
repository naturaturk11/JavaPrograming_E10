package day21_ArrayForEachLoop;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {


        String words="who are you";
        String[]newWord=words.split(" ");
        System.out.println(Arrays.toString(newWord));

        String[]A1=Arrays.copyOf(newWord,1);
        System.out.println(Arrays.toString(A1));



        String A2=A1[0].toUpperCase();
        System.out.println("A2.charAt(0) = " + A2.charAt(0));
        System.out.println("A2 = " + A2);
        String result="";
       char ch='a';
        for (int i = 0; i <A2.length() ; i++) {
           result+=ch;
        }
        System.out.println(result);



        System.out.println(A2);


        System.out.println(Arrays.toString(A1));
        String newWord1[]=Arrays.copyOfRange(newWord,0,newWord.length);
        System.out.println(Arrays.toString(newWord1));






    }
}
