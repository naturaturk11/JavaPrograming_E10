package day24_ReturnMethod;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int[]arr ={1,2,3};
        int num = 4;
   addElement(arr,num);




    }
    /*create a method named addElement that takes one integer array and one integer,
    the method can add the Integer number after the  last index of the integer array
    and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}

    */
    public static int[] addElement(int[]array,int number) {

        int[] ar1 = new int[array.length + 1];

        System.out.println(Arrays.toString(ar1));

        for (int i = 0; i < ar1.length; i++) {
            ar1[i]=array[i];
            }
         ar1[array.length]=number;

        System.out.println(Arrays.toString(ar1));

        return ar1;
        }



    }

