package day15ForLoop;

public class JavaFREQ {
    public static void main(String[] args) {

        /*write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence =JavaJava ;

            output:
                2*/

String a="JavaJava";
String word="Java";
int count=0;

        for (int i = 0; i <=a.length()-word.length() ; i++) {
             String b=a.substring(i,i+word.length()).toLowerCase();

           if(b.equals("java")){
               count++;
           }


        }
        System.out.println(count);




    }
}
