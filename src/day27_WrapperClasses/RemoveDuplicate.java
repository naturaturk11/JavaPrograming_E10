package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicate {


    public static void main(String[] args) {

       int[] arr={1,1,1,2,2,5,6,8,3,3};
       int[] arr2=removeDuplicates(arr);
       System.out.println(Arrays.toString(arr2));

       double[]array={2.1,3.6,8.1,6.1,2.1};
       double[]arr3  =removeDuplicates(array);
       System.out.println(Arrays.toString(arr3));

    }
    //removes the duplications from the given array,returns the new array
   public  static int[] removeDuplicates(int[]array){
        int[] result={};
       for (int each : array) {
           if(!ArraysUtility.contains(result,each)){
               result=ArraysUtility.addElement(result,each);
           }
       }
       return result;
   }

    //removes the duplications from the given array,returns the new array
    public  static double[] removeDuplicates(double[]array){
        double[] result={};
        for (double each : array) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //removes the duplications from the given array,returns the new array
    public  static char[] removeDuplicates(char[]array){
        char[] result={};
        for (char each : array) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //removes the duplications from the given array,returns the new array
    public  static String[] removeDuplicates(String[]array){
        String[] result={};
        for (String each : array) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    
    
    
}
