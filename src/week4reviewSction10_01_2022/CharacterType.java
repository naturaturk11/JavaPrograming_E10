package week4reviewSction10_01_2022;

public class CharacterType {

   /** Given a character, the task is to check whether the given character is in upper case, lower case, or non-alphabetic         character

    Input: ch = 'A'
    Output: A is an UpperCase character

    Input: ch = 'a'
    Output: a is an LowerCase character

    Input: ch = '0'
    Output: 0 is not an aplhabetic characte*/


   public static void main(String[] args) {


       char ch='l';
       String result=" ";
       boolean isUpperCase= ch>='A' && ch<='Z';
       boolean isLowerCase= ch>='a' && ch<='z';
       boolean isNotAlphabetic=!(isLowerCase||isUpperCase);

       if (isUpperCase){result = ch+" is a upper case character";}
       else if (isLowerCase) {result=ch+"is a lower case character";}
        else {result=ch+" is a alphabetic character";}
       System.out.println("result = " + result);
   }


   }






