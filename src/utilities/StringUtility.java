package utilities;

import java.util.Arrays;

public class StringUtility {

   //prints each character of the given string

    public static void printEachChar(String str){

        for (int s = 0; s <str.length() ; s++) {
            System.out.print(str.charAt(s));
        }
    }


    //REVERSES THE GİVEN sTRİNG AND RETURNS THE REVERSED sTRİNG
    public static String reverse(String str){//Java
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {

            result+=str.charAt(i);

        }

        return result;//avaJ

    }


    //checks if the given Strings is palindrome
    public static boolean isPalindrome(String str){
       return reverse(str).equalsIgnoreCase(str);


}

    //checks if the given String is anagram,return boolean
    public static boolean anagram(String str1,String str2){//"acb",,"abc"

    char[]arr1=str1.toCharArray();
    char[]arr2=str2.toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

  return Arrays.equals(arr1,arr2);


}


    //removes the duplicates from given string,returns string. "aaaaaaaaaabbbbbbaaaaaccc" "abc"
    public static String removeDuplicates(String str){
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            char each=str.charAt(i);
            if(!result.contains(each+"")){
                result+=each;
            }
        }

        return result;


    }







}
