package day30CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTests {
    public static void main(String[] args) {

        /*1. write a program that can swap the first and last elements of an ArrayList


        */

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        Collections.swap(list,0,list.size()-1);
        System.out.println(list);


        System.out.println("...............................................");


        /*2. Write a program that can move all the zeros to the last indexes of ArrayList

					Ex:
						list: {1,0,2,0,3,0,4,0}

					output:
						[1, 2, 3, 4, 0, 0, 0, 0]
        */

        ArrayList<Integer>list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(list);

       int size=list1.size();
        list1.removeAll(Arrays.asList(0));
        System.out.println(list1);

       int newSize=list1.size();
       int totalNumberOfZERO=size-newSize;

        System.out.println(totalNumberOfZERO);
        for (int i = 0; i < totalNumberOfZERO; i++) {
            list1.addAll(Arrays.asList(0));
        }
        System.out.println(list1);


        System.out.println("...........................................................");

        //second solutions


        ArrayList<Integer>list3=new ArrayList<>();
        list3.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer>result=new ArrayList<>();
        for (Integer each : list3) {
            if(each!=0){
                result.add(each);
            }
        }
        System.out.println(result);
        for (Integer each : list3) {
            if(each==0){
                result.add(each);
            }
        } System.out.println(result);

       /* 3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
        Ex:
        str = "ABCD123$%#@&456EFG!"

        output:
        list1: {1, 2, 3, 4, 5, 6}
        list2: {A, B, C, D, E, F, G}
        list3: {$, %, #, @, &, !}*/

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> chars=new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {
            chars.add(str.charAt(i));
            System.out.println("chars = " + chars);
        }
        ArrayList<Character>letters=new ArrayList<>(chars);

        System.out.println(letters);

        letters.removeIf(p->!Character.isLetter(p));//remove the characters that are letters
        System.out.println("letters = " + letters);

        ArrayList<Character> digits=new ArrayList<>(chars);//add all the characters
        digits.removeIf(p->!Character.isDigit(p));
        System.out.println("digits = " + digits);

        ArrayList<Character>specialCharacters=new ArrayList<>(chars);
        specialCharacters.removeAll(letters);//removeall and retainall methods only used when elements are known
        specialCharacters.removeAll(digits);
        System.out.println("specialCharacters = " + specialCharacters);

    }
}
