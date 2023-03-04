package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {


    public static void main(String[] args) {

        int[]nums={1,2,3,4,5,6};
        ArraysUtility.printEach(nums);

        System.out.println("................................");

         double[]arr1={2.1, 4.5, 8.3};
        ArraysUtility.printEach(arr1);

        System.out.println("..............................");

        char[]chars={'a','b','c'};
        ArraysUtility.printEach(chars);

        System.out.println("............................");

        String []names={"Hasan","Mert","Gülsüm","Zeynep"};
        ArraysUtility.printEach(names);

        int[]arr3={1,2,3,4,5,6};
        int max=ArraysUtility.maxNum(arr3);
        System.out.println("max = " + max);

        double[]arr4={2.1, 4.5, 8.3};
        double max1=ArraysUtility.maxNum(arr4);
        System.out.println("max1 = " + max1);


       
        int[]arr5={1,2,3,4,5,6};
        boolean a7=ArraysUtility.contains(arr5,8);
        System.out.println("a7 = " + a7);
      
      
        double[]arr6={2.1, 4.5, 8.3};
       boolean a5= ArraysUtility.contains(arr6,2.1);
        System.out.println("a5 = " + a5);


    }
}
