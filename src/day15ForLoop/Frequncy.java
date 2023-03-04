package day15ForLoop;

public class Frequncy {
    public static void main(String[] args) {
        /*write a program that can return the frequency of the a word Java from the
        sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create*/

        String a="JavaJava";
       int result=0;



        for (int i = 0; i <=a.length()-4 ; i++) {
            String b=a.substring(i,i+4);

             if(b.equalsIgnoreCase("java")){
            result++;

        }









    }System.out.println(result);
}}
