package day20_Array;

import java.util.Arrays;

public class Classmates {
    public static void main(String[] args) {
   /* 1. create an array named classmates, and store 10 of your classmates'
full names
print the initials of each classmates in separate lines*/

String[] classmates= {"ali ka","aysel de","halil çe","kerem ye","yusuf pe","hakkı ka",
        "emel ze","kamil ne","emre od","hasan sa"};




        for (int i = 0; i < classmates.length; i++) {
           String initial=classmates[i].charAt(0)+"."+classmates[i].charAt(classmates[i].indexOf(" ")+1);
               initial  =initial.toUpperCase();

            System.out.println(initial);//care of the place of print otherwise obtained wr

        }









    }
}
