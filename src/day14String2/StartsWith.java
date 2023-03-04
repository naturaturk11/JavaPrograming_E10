package day14String2;

import java.util.Scanner;

public class StartsWith {
    public static void main(String[] args) {
/*Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code*/

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word");
        String word=scan.next();
        scan.close();
         String result="";
        if(word.startsWith("x")){
            System.out.println(word.substring(1));
        }else {
            System.out.println(word);
        

    }

}}
