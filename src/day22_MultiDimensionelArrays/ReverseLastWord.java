package day22_MultiDimensionelArrays;

import java.util.Arrays;

public class ReverseLastWord {
    public static void main(String[] args) {


        String a="Today is monday";
        //Today is yadnoy


       String[]a1= a.split(" ");
        System.out.println(Arrays.toString(a1));
        String reversed="";

        for (int i = a1[2].length() - 1; i >= 0; i--) {
            reversed+=a1[2].charAt(i);

        }
        System.out.println(reversed);
         String a2=a.replaceFirst("monday",reversed);

        System.out.println(a2);








    }
}

