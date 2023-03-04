package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {


    public static void main(String[] args) {

        int[]arr = {1,2,3,4,5};
        int[] a1=replace(arr,2,30);
        System.out.println(Arrays.toString(a1));

        char[]arr1={'a','b','d','e'};
        char[]arr2= replace(arr1,2,'s');
        System.out.println(Arrays.toString(arr2));




    }
    /**1. Replace Task:
		1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement.
		 The method replaces the element of the array at given index with the new element, and returns the new array.
				Ex:
					arr = {1,2,3,4,5};

					replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


		1.2 Create the same functions for double arrays, char arrays, and String arrays
    */

    //method named replace that passes three parameters: integer array, integer index, integer newElement.
    public static int[] replace(int[]array,int index,int element){
       if(index<0 || index>array.length-1){
           System.err.println("Invalid index");
           System.exit(0);
       }
           array[index]=element;
           return array;




}

    //method named replace that passes three parameters: double array, integer index, double newElement.
    public static double[] replace(double[]array,int index,double element){
        if(index<0 || index>array.length-1){
            System.err.println("Invalid numbers");
            System.exit(0);
        }
        array[index]=element;
        return array;




    }

    //method named replace that passes three parameters: char array, integer index, integer newElement.
    public static char[] replace(char[]array,int index,char element) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid numbers");
            System.exit(0);
        }
        array[index] = element;
        return array;
    }

    //method named replace that passes three parameters: String array, integer index, integer newElement.
    public static String[] replace(String[]array,int index,String element){
            if(index<0 || index>array.length-1){
                System.err.println("Invalid numbers");
                System.exit(0);
            }
            array[index]=element;
            return array;

        }



    }








