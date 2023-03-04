package day14String2;

import java.util.Scanner;
/*Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the
    last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight*/


public class BringTogether {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter first  word");
        String firstWord=scan.next();

        System.out.println("enter first  word");
        String secondWord=scan.next();

        String result="";

        if(firstWord.charAt(firstWord.length()-1)==secondWord.charAt(0)){
            System.out.println(firstWord+secondWord);
        }


    }
}
