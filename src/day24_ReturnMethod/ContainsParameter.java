package day24_ReturnMethod;

import java.util.Arrays;

public class ContainsParameter {
    public static void main(String[] args) {

        int[]arr = {1,2,3,4,5,6,7};
       int num = 3;

       numberInTheArray(arr,num);




    }
    /*Create a method named contains that passes one integer array and one integer parameters,
     the method returns true if the given integer is contained in the given array,
     otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false

    */

public  static boolean numberInTheArray(int[]array,int num) {
boolean numberInTheArray=false;//temp
    for (int each : array) {
        if(each==num){
            numberInTheArray=true;

        }
    }
    System.out.println(numberInTheArray);
    return numberInTheArray;
}
}
