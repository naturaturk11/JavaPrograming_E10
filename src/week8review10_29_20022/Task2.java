package week8review10_29_20022;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        /*Task 2 :    Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

        output : wooden spoons
                 trash can
                  dish washer
        */

        String str="knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[]each=str.split(", ");
        System.out.println(Arrays.toString(each));
        String temp="";

        for (String mullti : each) {
            if(mullti.contains(" ")){
                System.out.println(mullti);
            }
        }











    }
}
