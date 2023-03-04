package day26_CustomMethodPractices;

import java.util.Arrays;

public class MergeTwoArrays {


    public static void main(String[] args) {

        int[]arr1={1,2,3,4,5,6};
        int[]arr2={1,6,3,8,5,9};

        int[] arr3=merge(arr1,arr2);
        System.out.println(Arrays.toString(arr3));



    }

    public static int[]merge(int[] arr1,int[]arr2){

        int[] result=new int[arr1.length+arr2.length];

       int i=0;

        for (int each : arr1) {
            result[i++]=each;

        }
        for (int each : arr2) {
            result[i++]=each;

        }

        return result;

    }


}
