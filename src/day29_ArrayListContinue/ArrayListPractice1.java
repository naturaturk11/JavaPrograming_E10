package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {
/*
1. create an Array of string called countries
2. write a program that can remove all the country names that have length of 10 or greater
 */

        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada", };

        //1 ********converting array to arraylist!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!****

        ArrayList<String>list=new ArrayList<>(Arrays.asList(countries));
        list.removeIf(p-> p.length()>=10);
        System.out.println(list);

        //2 *********converting the arrayList back to array

                        //toArray method was selected
        countries=list.toArray(new String[0]);//any number could be put instead of 0 but putting 0 is the best solution
        System.out.println(Arrays.toString(countries));





    }
}
