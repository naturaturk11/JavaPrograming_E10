package day24_ReturnMethod;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[]array = {10, 20, 30, 40, 50, 60};
       int index = 2;

        removeElement(array,index);


    }

    /*create a method named removeElement that passes one integer array and one integer,
    the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}
    */

    public static int[]removeElement(int[]array,int index){

        int[]ar1=new int[array.length-1];

        int j=0;
        for (int i = 0; i < array.length; i++) {
            if(i!=index){
                ar1[j++]=array[i];
        }
        }
        System.out.println(Arrays.toString(ar1));
        return ar1;







}}
