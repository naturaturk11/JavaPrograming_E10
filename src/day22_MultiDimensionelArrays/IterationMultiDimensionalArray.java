package day22_MultiDimensionelArrays;

import java.util.Arrays;

public class IterationMultiDimensionalArray {
    public static void main(String[] args) {

        //      İNDEX  0 1 2   0 1 2 3   0 1 2 3 4 5
        int[][]arr2D={{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        //       İNDEX=  0         1         2

        for (int i = 0; i < arr2D.length; i++) {

            //System.out.println(Arrays.toString(arr2D[i]));// it gives me single arrays not element

            for (int j = 0; j < arr2D[i].length; j++) {//!!!arr2D[i] represents the single array

                System.out.print(arr2D[i][j]+" ");//j is index of element


            }






        }

        System.out.println(".................................................................");














    }
}
