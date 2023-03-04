package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;
import utilities.StringUtility;

import java.util.Arrays;

public class A {


    public static void main(String[] args){

        String names="aernbmvkghufhfgddfhfh";
        names=  StringUtility.reverse(names);
        System.out.println(names);

      StringUtility.removeDuplicates(names);
      names= StringUtility.removeDuplicates(names);
        System.out.println(names);

        names=names.toUpperCase();
        System.out.println(names);

    }



}
