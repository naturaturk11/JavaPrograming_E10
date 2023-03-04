package day29_ArrayListContinue;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        for (int i = 0; i < list.size(); i++) {


          /*  if(list.get(i)%2!=0){
                list.remove(i);
            }*/

            list.removeIf(p -> p<5);//remove if method usage with Lambda expression

        }
        System.out.println("list = " + list);
        System.out.println("list = " + list);


        System.out.println(list);


        System.out.println("...........................................................");

        ArrayList<Integer> list2=new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list2.removeIf(p-> p%2!=0);
        System.out.println(list2);


        System.out.println("................................................");

        ArrayList<String> list3=new ArrayList<>();
        list3.addAll(Arrays.asList("java","iphone","javaScript","JAVA"));
        System.out.println("list3 = " + list3);
        list3.removeIf(p->p.toLowerCase().startsWith("j"));//lower case sensitivity is added
        System.out.println("list3 = " + list3);


        System.out.println(".............................................................");

       ArrayList<String> names=new ArrayList<>();
       names.addAll(Arrays.asList("ANNA","LEVEL","EYE","JAVA","PYTHON","CYDEO"));
       names.removeIf(name-> !StringUtility.isPalindrome(name));
        System.out.println("names = " + names);











    }
}
