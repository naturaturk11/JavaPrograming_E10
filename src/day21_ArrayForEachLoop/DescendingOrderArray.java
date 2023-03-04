package day21_ArrayForEachLoop;

import java.util.Arrays;

public class DescendingOrderArray {
    public static void main(String[] args) {


        int[] nums={1,2,3,4,5,6,7,8,9};
        int[]temp=new int[nums.length];


        int j=0;
        for (int i = nums.length - 1; i >= 0; i--) {

                temp[j++]=nums[i];



        }System.out.println(Arrays.toString(temp));
    }








}
