package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCH {


    public static void main(String[] args) {
        String str="aasscddasaapdffgghhhwfrrr";

        String[] arr=str.split("");
        System.out.println(Arrays.toString(arr));
        ArrayList<String>letters=new ArrayList<>(Arrays.asList(arr));
        System.out.println(letters);

        for (String letter : letters) {
           int frequency= Collections.frequency(letters,letter);
            if(frequency==1){
                System.out.print(letter+" ");
            }
        }

    }
}