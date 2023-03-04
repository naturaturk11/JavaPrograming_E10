package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {
        
        //the converting  way of String to array list
        String str="aasscddasaapdffgghhhwfrrr";
        
     String[] arr=str.split(" ");     //converting the string in to the array
        ArrayList<String> list=new ArrayList<>(Arrays.asList(arr));
        System.out.println("list = " + list);

        String unique="";
        for (String each : list) {//this is method which is implemented without creating a second loop
          int frequency=  Collections.frequency(list,each);
            if (frequency == 1) {
                unique+=each;
            }
        }
        System.out.println("unique = " + unique);


    }
}
