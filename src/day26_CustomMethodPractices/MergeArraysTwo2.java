package day26_CustomMethodPractices;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeArraysTwo2 {
    public static void main(String[] args) {

      String[]arr1={"A","B","C"};
        String[]arr2={"D","E","F"};
        String[]arr3=merge(arr1,arr2);
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

    }
    //merge the given two arrays and returns the new arrays
    public static double[] merge(double[]arr1,double[]arr2){
 double[] result={};

    for (double each : arr1) {
        result=ArraysUtility.addElement(result,each);
    }
    for (double each : arr2) {
       result= ArraysUtility.addElement(result,each);
    }
     return result;
}

    //merge the given two arrays and returns the new arrays
    public static char[] merge(char[]arr1,char[]arr2){
        char[] result={};

        for (char each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (char each : arr2) {
            result= ArraysUtility.addElement(result,each);
        }
        return result;
    }

    //merge the given two arrays and returns the new arrays
    public static String[] merge(String[]arr1,String[]arr2){
        String[] result={};

        for (String each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (String each : arr2) {
            result= ArraysUtility.addElement(result,each);
        }
        return result;
    }


    //merge the given two arrays and returns the new arrays
    public static int[] merge(int[]arr1,int[]arr2){
        int[] result={};

        for (int each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (int each : arr2) {
            result= ArraysUtility.addElement(result,each);
        }
        return result;
    }


}
