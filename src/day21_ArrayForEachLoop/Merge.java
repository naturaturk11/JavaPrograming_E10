package day21_ArrayForEachLoop;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        /*Write a program that can merge 3 arrays of integers

    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}

			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}

        */
        int[]arr1 = {30, 10, 20};
        int[] arr2  = {15, 40, 25, 35};
        int[]arr3 = {8, 9, 17, 5, 4, 1};

        int[]all=new int[arr1.length+arr2.length+arr3.length];

        int i=0;//not forget to add this temp int
        for (int each : arr1) {
            all[i++]+=each;//not forget to add iteration
        }
        for (int each : arr2) {
            all[i++]+=each;
        }
        for (int each : arr3) {
            all[i++]+=each;
        }

        Arrays.sort(all);
        System.out.println(Arrays.toString(all));











    }
}
