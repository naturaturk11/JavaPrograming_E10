package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;
import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str="Programing Language";


        StringUtility.printEachChar(str);
        System.out.println();
        str=StringUtility.reverse(str);
        System.out.println(str);

        System.out.println("......................................................");

        String word="Civic";
         boolean palindrome=StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        String[]names={"anna","java","racecar","mom","cydeo"};
        int count=0;
        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }

        }
        System.out.println(count);

          String str2="aaaabbbcccddd";
          String nonDup=StringUtility.removeDuplicates(str2);
        System.out.println("nonDup = " + nonDup);













    }


}
