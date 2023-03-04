package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {

        int[]arr = {10, 10, 20, 30, 40, 30, 30, 30};

       int[]arr1= replaceAll(arr,30,300);
        System.out.println(Arrays.toString(arr1));



    }

    /* RecplaceAll Task:
		2.1 Create a method named replaceAll that passes three parameters: integer array, integer oldElement, integer newElement.
		 The method replaces all the element of the array that matching with the given old element with the given new element,
		 and returns the new array.
			Ex:
				arr = {10, 10, 20, 30, 40, 30, 30, 30};

				replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


		2.2 Create the same functions for double arrays, char arrays, and String arrays

    */
      //replaceAll that passes three parameters: integer array, integer oldElement, integer newElement.
      public static int[] replaceAll(int[]array,int oldElement,int newElement){

          for (int i = 0; i < array.length; i++) {
              if(array[i]==oldElement){//if array index equals to oldElement then array[i] equals to newElement
                  array[i]=newElement;//care the used sign not equal but assignment!!!!!!!!
              }

          }
           return array;
      }

      //replaceAll that passes three parameters: double array, double oldElement, double newElement.
      public static double[] replaceAll(double[]array,double oldElement,double newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldElement){//if array index equals to oldElement then array[i] equals to newElement
                array[i]=newElement;//care the used sign not equal but assignment!!!!!!!!
            }

        }
        return array;
    }

      //replaceAll that passes three parameters: char array, char oldElement, char newElement.
      public static char[] replaceAll(char[]array,char oldElement,char newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldElement){//if array index equals to oldElement then array[i] equals to newElement
                array[i]=newElement;//care the used sign not equal but assignment!!!!!!!!
            }

        }
        return array;
    }

      //replaceAll that passes three parameters: String array, String oldElement, String newElement.
      public static String[] replaceAll(String[]array,String oldElement,String newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(oldElement)){//if array index equals to oldElement then array[i] equals to newElement
                array[i]=newElement;//care the used sign not equal but assignment!!!!!!!!
            }

        }
        return array;
    }


}
