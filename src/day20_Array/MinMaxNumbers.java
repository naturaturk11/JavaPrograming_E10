package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
/*3. Write a program that asks user to enter a number 10 times:
			1. store all user entered numbers in an array
			2. find the max number
			3. find the min number*/

        int[] nums= new int[10];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter a number");//here is done a statement instead of above
            nums[i]=scan.nextInt();//each user entered input will be assigned to the indexes of the array numbers
            //!!!!!!!!!!!!

        }

        int max=nums[0];//just assumption
        int min=nums[0];//just assumption

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                max=nums[i];
            }

            if(nums[i]<min){
                min=nums[i];
            }



        }
        System.out.println(Arrays.toString(nums));
        System.out.println("min = " + min);
        System.out.println("max = " + max);







    }
}
