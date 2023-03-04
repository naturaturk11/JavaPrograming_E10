package day20_Array;

import java.sql.Array;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
      int [] array = {10, 0, 5, 0, 1, 0};
       int[] arr1=new int[array.length];

       int j=0;
        for (int i = 0; i < array.length; i++) {
         if(array[i]!=0){
             arr1[j++]+=array[i];
         }



        }System.out.println(Arrays.toString(arr1));

    }
}
