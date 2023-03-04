package day21_ArrayForEachLoop;

import java.util.Arrays;

public class DescendingOrder {

    public static void main(String[] args) {

        int[]numbers={1,2,3,4,5,6,7,8};
        int[]result=new int[numbers.length];



        for (int i = numbers.length - 1,j=0; i >= 0; i--,j++) {
           result[j]=numbers[i];

        }
        System.out.println(Arrays.toString(result));





    }
}
