package day24_ReturnMethod;

import java.util.Arrays;

public class MergeArrayReturn {
    public static void main(String[] args) {

     int[]arr={1,2,3,4,5};
     int[]arr1={5,6,7,8,9};

     int[]mergeArray=mergeArray(arr,arr1);
        System.out.println(Arrays.toString(mergeArray));



    }
    public static int[] mergeArray(int[] arr,int[]arr1){
        int result=0;

        int[]arr3=new int[arr.length+arr1.length];

        for (int number: arr) {
            arr3[result++]=number;
        }
        for (int number : arr1) {
            arr3[result++]=number;
        }

        return arr3;


    }








}
