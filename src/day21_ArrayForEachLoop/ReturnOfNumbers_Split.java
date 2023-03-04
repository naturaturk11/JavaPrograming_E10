package day21_ArrayForEachLoop;

import java.util.Arrays;

public class ReturnOfNumbers_Split {
    public static void main(String[] args) {

        /*Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)
        */


         String words="java,python,java,python,java";
         String []each= words.split(",");
        System.out.println(Arrays.toString(each));


        int javaCount=0;
         int pythonCount=0;

        for (String each1 : each) {

            if(each1.equalsIgnoreCase("java")){
             javaCount++;

            } else if (each1.equalsIgnoreCase("python")) {
                pythonCount++;

            }


        }
        System.out.println(Arrays.toString(each));
        System.out.println("pythonCount = " + pythonCount);
        System.out.println("javaCount = " + javaCount);














    }
}
