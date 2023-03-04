package day22_MultiDimensionelArrays;

import java.util.Arrays;

public class MultiDimensional2 {
    public static void main(String[] args) {

        int[] arr1={1,2,3};
        int[] arr2={4,5,6};
        int[] arr3={7,8,9};

     int[][] arr2D={{1,2,3},{4,5,6},{7,8,9}};



//3 DİMENSİONAL ARRAY CONTAİNS TWOD ARRAYS

int[][][] ar3D={ { {1,2,3},{4,5,6},{7,8,9} },{ {10,20,30},{40,50,60},{70,80,90} } };
        System.out.println(Arrays.deepToString(ar3D));
        //[index of 2DArray][index of num 1D Array][index number of elements]



           //ONE SOLUTİON
        System.out.println(Arrays.deepToString(ar3D[0]));
        System.out.println(Arrays.toString(ar3D[0][0]));
        System.out.println(ar3D[0][0][0]);


        System.out.println("..........................................................");
          //SECOND SOLUTİON BUT BEST OPTİON
        for (int[][]ar2d : ar3D) {
            for (int[] ar1d : ar2d) {
                for (int eachElement : ar1d) {
                    System.out.print(eachElement+" ");
                }
            }
        }

        System.out.println("................................................................");




    }
}
