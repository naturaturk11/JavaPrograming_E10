package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.sql.Array;
import java.util.Arrays;

public class RemoveDuplicatePractice {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 2, 1, 3, 2, 5, 6, 71};

        int[] a1 = removeDuplicate(a);
        System.out.println(Arrays.toString(a1));


    }

    public static int[] removeDuplicate(int[] arr) {

        int[]arr1={};
        for (int each : arr) {
            if(!ArraysUtility.contains(arr1,each)){
               arr1=ArraysUtility.addElement(arr1,each);

            }
        }return arr1;


    }
}
