package day21_ArrayForEachLoop;

import day14String2.IfSubstringTwoWORDS;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {









        int[] nums={1,2,3,4,5};

        System.out.println(nums);

        String str="java";

        System.out.println(Arrays.toString(nums));

        System.out.println("...............................................................................");

        int[] scores={95,100,55,65,75,71};

         Arrays.sort(scores);


        System.out.println(Arrays.toString(scores));
        System.out.println("min scores:"+scores[0]);
        System.out.println("max scores:"+scores[scores.length-1]);

       String [] names={"Anne","Ahmet","Gunay","Maria","Sinama","Zuhal"};//a-z,A-Z,-10-10,0-9...

       Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String[] words={"ANNA","anna"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));


        int[] arr1={1,2,3};
        int[]arr2={1,3,2};

        boolean r1 =Arrays.equals(arr1,arr2);

        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2=Arrays.equals(arr1,arr2);
        System.out.println(r2);


        System.out.println("......................................................................");

         char[] ch1={'b','c','a'};
        char[] ch2={'a','b','c'};

        Arrays.sort(ch1);//a,b,c
        Arrays.sort(ch2);//a,b,c

        boolean anagram=Arrays.equals(ch1,ch2);
        System.out.println("anagram = " + anagram);










    }







}
