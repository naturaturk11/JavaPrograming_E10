package day16ForLoopStringPractice;

import java.util.Locale;

public class RemoveDuplicates2 {
    public static void main(String[] args) {


        String s1 = " the one person I met YESTERDAY";
         s1=s1.toLowerCase();
        String result = "";

        for (int i = 0; i < s1.length(); i++) {
            String ch = "" + s1.charAt(i);

            if (!result.contains(ch)  ) {
                result += ch;


            }

        }
        System.out.println("result = " + result);


        System.out.println("............................................................");













    }
}