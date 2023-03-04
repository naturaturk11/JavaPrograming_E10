package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapTest {


    public static void main(String[] args) {

        int[]arr = {10, 20, 30, 40, 50};
        ArrayList<Integer>numbers=new ArrayList<>(Arrays.asList(10,20,30,40,50));
        Collections.swap(numbers, 2,4);
        System.out.println(numbers);


    }

    }

    /*2.1 Create a method named swap that passes three parameters: integer array, integer i,
     integer j.
    the method swaps the element at index i with the element at index j, and returns the new array
                Ex:
                    arr = {10, 20, 30, 40, 50};

                    swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

        2.2 Create the same function for double array, char array and string array
    */

