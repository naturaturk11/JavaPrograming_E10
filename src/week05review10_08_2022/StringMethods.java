package week05review10_08_2022;

public class StringMethods {
    public static void main(String[] args) {

//Task 1: Given a string,
// print the string made of its first two chars, so the String "Hello" yields “HE".

String str="Hello";
String str1=str.toUpperCase();
        System.out.println(str1);
 char str2=str.charAt(0);
 char str3=str.charAt(1);
        System.out.println(""+str2+str3);

        System.out.println("........................................................");

//Task 2: Create a logic print a new string made of 3 copies of the last 2 chars
// of the original string.
//
//      Hint: The string length will be at least 2.


String name="hello";
char name1=name.charAt(name.length()-2);
char name2=name.charAt(name.length()-1);

System.out.println("........................................................");
String sentence  ="java is not same with java";





    }




}
