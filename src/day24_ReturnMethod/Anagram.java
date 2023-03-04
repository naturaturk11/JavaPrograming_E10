package day24_ReturnMethod;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
         String str1 = "cba";
         String str2 = "bac";
         anagram(str1,str2 );



    }

    /*create a method named isAnagram that passes two String parameters, the method returns true
    if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true


    */
    public static boolean anagram(String str1,String str2){


        char[] a1=str1.toCharArray();
        char[] a2=str2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        boolean anagram=Arrays.equals(a1,a2);
        if(anagram){
            System.out.println("anagram");
        }else {
            System.out.println("not anagram");
        }

       return anagram;



    }




}
