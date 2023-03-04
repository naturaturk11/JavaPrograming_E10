package day22_MultiDimensionelArrays;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {

        /*Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java
        */


         String sentence = "I Love Java";
         String[] words=sentence.split( " ");
         String reversedWords="";

         for(int i=words[1].length()-1;i>=0;i--){
             reversedWords+=words[1].charAt(i);
         }

        System.out.println(reversedWords);
        String words1= sentence.replaceFirst(words[1],reversedWords);
        System.out.println(words1);
        /*SECOND SOLUTİON
        words[1]=reversedWords;
        System.out.println(Arrays.toString(words));

        for (String word : words) {
            System.out.print(word+" ");*/
        }





    }

