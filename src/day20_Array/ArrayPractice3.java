package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length= scan.nextInt();//10
        //!!!!!!!!

        if (length <= 0) {
            System.out.println("Invalid Method");
            System.exit(0);
        }
        int[] numbers=new int[length];

        for (int i=0;i<length;i++){//ARRAY NEEDS TO HAVE ENOUGH CAPACİTY TO CONTAİN ALL ELEMENTS THE USER ENTERS
            System.out.println("enter a number");
            numbers[i] = scan.nextInt();//!!!!!!  İ VARİABLE İS USED TO ASSİGN TO INDEX NUMBER
            //!!!!!
            /*EACH İNPUT USER PROVİDED DURİNG EACH EXECUTİON OF THE LOOP WİLL BE ASSİGNED
            TO THE İNDEXES OF THE ARRAY */
        }


        System.out.println(Arrays.toString(numbers));

       scan.close();




    }
}
