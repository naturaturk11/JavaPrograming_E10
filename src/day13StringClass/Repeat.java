package day13StringClass;

public class Repeat {
    public static void main(String[] args) {

        String word="hello";
         String result="";

        for (int i = word.length(); i > 0; i--) {
            char ch=word.charAt(i);
            result+=ch;







    }
        System.out.println(result);
}}
