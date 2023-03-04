package day21_ArrayForEachLoop;

import java.util.Arrays;

public class AnagramExe {

    public static void main(String[] args) {

        String art="listen";
        String art1="silent";


       char[]str=art.toCharArray();
       char[]str1=art1.toCharArray();

        System.out.println("Arrays.toString(str) = " + Arrays.toString(str));
        System.out.println("Arrays.toString(str1) = " + Arrays.toString(str1));

        Arrays.sort(str);
        Arrays.sort(str1);

        System.out.println("Arrays.toString(str) = " + Arrays.toString(str));
        System.out.println("Arrays.toString(str1) = " + Arrays.toString(str1));

        boolean isANAGRAM=Arrays.equals(str,str1);
        System.out.println("isANAGRAM = " + isANAGRAM);
    }
}
