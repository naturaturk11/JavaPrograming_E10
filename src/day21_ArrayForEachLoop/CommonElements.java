package day21_ArrayForEachLoop;

import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {

        /*Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops
        */
        int[]arr1= {1,2,3,4,5};
       int[] arr2= {4,5,6,7,8};
     int common=0;

        for (int each : arr1) {
            for (int element : arr2) {
                if(each==element){
                    System.out.println(each);

            }
        }




        }


    }
}
