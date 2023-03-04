package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Insert_Task {


    public static void main(String[] args) {


        /*1.1 Create a method named insert that passes three parameters: integer array, integer index, 
        integer element. the method inserts the given element to the given index of the array and returns 
        the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for int array, char array and string array
        */

        int[]arr1={1,2,3,4,5,6};
        int[]arr2=insert(arr1,2,8);
        System.out.println(Arrays.toString(arr2));

        char[]arr3={'a','b','c','d','e'};
        char[]arr4=insert(arr3,2,'f');
        System.out.println(Arrays.toString(arr4));


        
        
        
        
        
    }


    //insert that passes three parameters: integer array, integer index, integer element.
    public static int[] insert(int[]array,int index,int element){

        int[]result=new int[array.length+1];
        if(index<0 || index>result.length-1){
            System.out.println("Index is invalid");
            System.exit(0);
        }
        result=ArraysUtility.addElement(array,element);
        result= ArraysUtility.replace(array,index,element);
        return result;
    }
    //insert that passes three parameters: DOUBLE array, integer index, DOUBLE element.
    public static double[] insert(double[]array,int index,double element){

        double[]result=new double[array.length+1];
        if(index<0 || index>result.length-1){
            System.out.println("Index is invalid");
            System.exit(0);
        }
        result=ArraysUtility.addElement(array,element);
        result= ArraysUtility.replace(array,index,element);
        return result;
    }
    //insert that passes three parameters: char array, integer index, char element.
    public static char[] insert(char[]array,int index,char element){

        char[]result=new char[array.length+1];
        if(index<0 || index>result.length-1){
            System.out.println("Index is invalid");
            System.exit(0);
        }
        result=ArraysUtility.addElement(array,element);
        result= ArraysUtility.replace(array,index,element);
        return result;
    }

    //insert that passes three parameters: String array, integer index, String element.
    public static String[] insert(String[]array,int index,String element){

        String[]result=new String[array.length+1];
        if(index<0 || index>result.length-1){
            System.out.println("Index is invalid");
            System.exit(0);
        }
        result=ArraysUtility.addElement(array,element);
        result= ArraysUtility.replace(array,index,element);
        return result;
    }
    
}
