package day14String2;

import java.util.Scanner;

public class AskWord {
    public static void main(String[] args) {
/* ask the user to enter a word. if the word ends with "ly", print "really???" ,
otherwise, print "never mind"
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        if (word.endsWith("ly")) {
            System.out.println("really");
        } else {
            System.out.println("never mind");
        }


    }
}

