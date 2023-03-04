package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseClasmates {
    public static void main(String[] args) {

    /*   create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c                             */


        String[] classmates= {"ali ka","aysel de","halil çe","kerem ye","yusuf pe","hakkı ka",
                "emel ze","kamil ne","emre od","hasan sa"};

        for (String each: classmates) {
            String reversed="";

            for (int i = each.length()-1; i >=0 ; i--) {
                reversed+=each.charAt(i);
                reversed=reversed.toUpperCase();
        }

            System.out.println(reversed);
        }














    }
}
