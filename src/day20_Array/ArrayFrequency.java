package day20_Array;

import java.util.Arrays;

public class ArrayFrequency {
    public static void main(String[] args) {

        char[] chars={'A','B','A','B','C','D','D'};


        for (int i = 0; i < chars.length; i++) {

         char ch=chars[i];
         int frequency=0;


            for (int j = 0; j < chars.length; j++) {

               if(chars[j]==ch){
                   frequency++;
               }


            }if(frequency==1){
                System.out.println("ch = " + ch);
            }
        }




    }
}
