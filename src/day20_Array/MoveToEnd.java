package day20_Array;

import java.util.Arrays;

public class MoveToEnd {

    public static void main(String[] args) {

       /* write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0
        */

        int[]array = {10, 0, 5, 0, 1, 0};
        int result[]=new int[array.length];
        int j=0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]!=0){
                result[j++]=array[i];
            }


        }
        System.out.println(Arrays.toString(result));


       int[]arr1={1,2,3,0,3,9,6,0,2,0,3};
       int[]arr2=new int[arr1.length];
       int m=0;

        for (int i = 0; i <arr1.length ; i++) {
            if(arr1[i]!=0){
                arr2[m++]=arr1[i];
            }
        }
        System.out.println(Arrays.toString(arr2));


    }
}
