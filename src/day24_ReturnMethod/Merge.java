package day24_ReturnMethod;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {

       int[] arr1 = {1,2,3};
       int[] arr2 = {4,5,6};
       mergeNumbers(arr1,arr2);




    }
    /* Create a method named merge that passes two integer array parameters, the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}
    */
    public static int[] mergeNumbers(int[]arr1,int[]arr2){

        int[]arr3=new int[arr1.length+arr2.length];

        int i=0;
        for (int each : arr1) {
            arr3[i++]+=each;
        }
        for (int num : arr2) {
           arr3[i++]+=num;
        }

        System.out.println(Arrays.toString(arr3));
        return arr3;

    }








}
