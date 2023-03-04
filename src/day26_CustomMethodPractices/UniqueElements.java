package day26_CustomMethodPractices;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        int[]arr={1,2,2,3,4,3,4,5,6,2,6,7,8};
       int[] unique=uniqueElements(arr);
        System.out.println(Arrays.toString(unique));

        double[]array={2.1,3.6,8.1,6.1,2.1};
        double[]arr1=uniqueElements(array);
        System.out.println(Arrays.toString(arr1));



    }






    public static int[] uniqueElements(int[]array){
        int[]result={};//temp array-new int[0]
        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){//İF THE FREQUENCY İS 1 THE ELEMENT İS UNİQUE
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static double[] uniqueElements(double[]array){
        double[]result={};//temp array-new double[0]
        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){//İF THE FREQUENCY İS 1 THE ELEMENT İS UNİQUE
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static char[] uniqueElements(char[]array){
        char[]result={};//temp array-new double[0]
        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){//İF THE FREQUENCY İS 1 THE ELEMENT İS UNİQUE
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static String[] uniqueElements(String[]array){
        String[]result={};//temp array-new double[0]
        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){//İF THE FREQUENCY İS 1 THE ELEMENT İS UNİQUE
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }






}
