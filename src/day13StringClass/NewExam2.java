package day13StringClass;

import java.util.Scanner;

public class NewExam2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scan.next();
        String result="";


        if(word.length()<5){
            result="too short";
        } else if (word.length()>5) {
            result="too long";


        } else if (word.length()==5) {



            for (int i = word.length()-1; i >= 0; i--) {
             char ch=word.charAt(i);
                result+=ch;
            }
        }
        System.out.println(result);

    }
}
