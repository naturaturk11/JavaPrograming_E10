package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysToArrayList_ALtoArray {
    public static void main(String[] args) {

        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada", };

        //1 ********converting array to arraylist!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!****

        ArrayList<String> list=new ArrayList<>(Arrays.asList(countries));
        System.out.println("list = " + list);


        //2 ********converting arrayList to array!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!****
        countries=list.toArray(new String[0]);
        System.out.println("Arrays.toString(countries) = " + Arrays.toString(countries));


    }
}
