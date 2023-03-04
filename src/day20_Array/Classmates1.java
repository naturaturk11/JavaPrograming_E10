package day20_Array;

import java.util.Arrays;

public class Classmates1 {
    public static void main(String[] args) {

        String[] classmates={"ali ka","aysel de","halil çe","kerem ye","yusuf pe","hakkı ka",
                "emel ze","kamil ne","emre od","hasan sa"};


        for (int i = 0; i < classmates.length; i++) {

            String initials=classmates[i].charAt(0)+"."+classmates[i].charAt(classmates[i].indexOf(" ")+1);
            initials=initials.toUpperCase();
            System.out.println(initials);
        }










    }
}
