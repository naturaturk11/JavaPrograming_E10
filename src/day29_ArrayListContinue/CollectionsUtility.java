package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,5,4,6,7,8,9));

        //sort
       // Arrays.sort(list);array list a collection type thats why Arrays.sort cannot be used here

        Collections.reverse(list);
        System.out.println("list = " + list);
        Collections.sort(list);
        System.out.println(list);

        //reverse
        Collections.reverse(list);
        System.out.println("list = " + list);

        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("ANNA","LEVEL","EYE","JAVA","PYTHON","CYDEO"));
         Collections.reverse(names);
        System.out.println("names = " + names);
        
        
        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(10,2,0,30,40,60,70,80));
        System.out.println("list2 = " + list2);


        //swap=exchange the places
        Collections.swap(list2,2,6);
        System.out.println("list2 = " + list2);

        ArrayList<Integer> list3=new ArrayList<>();
        list3.addAll(Arrays.asList(10,2,0,30,40,60,70,80));
        System.out.println("list3 = " + list3);


        //max
        list3.addAll(Arrays.asList(10,2,0,30,40,60,70,80));
        int max=Collections.max(list3);
        System.out.println("max = " + max);

        //MİN
        int min=Collections.min(list3);
        System.out.println("min = " + min);


        System.out.println("........................................");
          //replaceAll
          ArrayList<Integer> list4=new ArrayList<>();
          list4.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10,10));
        System.out.println("list4 = " + list4);


          Collections.replaceAll(list4,10,1586);
        System.out.println("list4 = " + list4);


        System.out.println(".........................................................");

        //FREQUENCY digits
        ArrayList<Integer> list5=new ArrayList<>();
        list5.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10,10));

      int frequency=  Collections.frequency(list5,10);
        System.out.println("frequency = " + frequency);


        //FREQUENCY String
        ArrayList<String> words=new ArrayList<>();
        words.addAll(Arrays.asList("james", "jack","JAVA", "daniel","Python","JAVA", "shay","JAVA", "berna"));

        int countJava=Collections.frequency(words,"JAVA");
        int countPython=Collections.frequency(words,"Python");

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);







    }
}
