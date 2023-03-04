package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.sql.Array;
import java.util.Arrays;

public class InsertPractice {

    public static void main(String[] args) {
        char []a1={'a','b','c','d','e'};


        char[]a2=replace(a1,2,'n');
        System.out.println(Arrays.toString(a2));






    }
    public static char[] replace(char[]arr,int index,char element){
        char[]arr2=new char[arr.length-1];
       arr2= ArraysUtility.addElement(arr,element);
        arr2=ArraysUtility.replace(arr, index, element);
        return arr2;
    }

}
