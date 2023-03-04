package day26_CustomMethodPractices;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {


        int[]arr={1,2,3,4,5,6,7};
      int[]result  =reverse(arr);
        System.out.println(Arrays.toString(result));

    }
    //reverse the Aarray,returns the new Array
    public static int[] reverse(int[]array){
        int[]result=new int[array.length];
         //int j= 0;this is another option of addding j=0 and j++
        int j=0;
         for (int i = array.length - 1; i >= 0; i--) {
             //result[j++]=array[i];//when added temp int j=0 then increase the size of j only
             result[j++]=array[i];
        }
        return result;
    }
    //reverse the Aarray,returns the new Array
    public static String[] reverse(String[]array){
        String[]result=new String[array.length];
        //String j= 0;this is another option of addding j=0 and j++
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            //result[j++]=array[i];//when added temp String j=0 then increase the size of j only
            result[j]=array[i];
        }
        return result;
    }
    //reverse the Aarray,returns the new Array
    public static double[] reverse(double[]array){
        double[]result=new double[array.length];
        //double j= 0;this is another option of addding j=0 and j++
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            //result[j++]=array[i];//when added temp double j=0 then increase the size of j only
            result[j]=array[i];
        }
        return result;
    }
    //reverse the Aarray,returns the new Array
    public static char[] reverse(char[]array){
        char[]result=new char[array.length];
        //char j= 0;this is another option of addding j=0 and j++
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            //result[j++]=array[i];//when added temp char j=0 then increase the size of j only
            result[j]=array[i];
        }
        return result;
    }
}
