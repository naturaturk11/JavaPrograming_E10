package day20_Array;

import java.sql.Array;
import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
      /* Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
        */
       int[] array = {1,2,3,4,5};
       int[] reversedArray= new int [array.length];//firstly to get equaled the length in both
        int j=0;
        for (int i = reversedArray.length - 1; i >= 0; i--) {
            reversedArray[j++]=array[i];


            
        }System.out.println(Arrays.toString(reversedArray));








    }
}
