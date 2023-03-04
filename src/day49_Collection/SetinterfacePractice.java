package day49_Collection;

import java.util.*;

public class SetinterfacePractice {

    public static void main(String[] args) {


        Set<Integer> hashset1=new HashSet<>();//FASTEST PERFORMANCE
        hashset1.addAll(Arrays.asList(10,20,60,100,500));
        System.out.println("hashset1 = " + hashset1);
        System.out.println("hashset1 = " + hashset1);

        System.out.println("hashset1 = " + hashset1);

        System.out.println("hashset1 = " + hashset1);

        Set<Integer> linkedSet=new LinkedHashSet<>();

        Set<Integer> treeSet=new TreeSet<>();


        Set<Integer>linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10,20,30,40,50));
        linkedHashSet.addAll(Arrays.asList(10,20,30,40,50));
        linkedHashSet.addAll(Arrays.asList(10,20,30,40,50));
        linkedHashSet.addAll(Arrays.asList(10,20,30,40,50));
        linkedHashSet.addAll(Arrays.asList(10,20,30,40,50));

        System.out.println("linkedHashSet = " + linkedHashSet);



        Set<Integer>treeset=new TreeSet<>();
        treeset.addAll(Arrays.asList(10,60,80,15,45,98));
        treeset.addAll(Arrays.asList(10,60,80,15,45,98));
        treeset.addAll(Arrays.asList(10,60,80,15,45,98));
        treeset.addAll(Arrays.asList(10,60,80,15,45,98));
        treeset.addAll(Arrays.asList());

        System.out.println("treeset = " + treeset);


    }
}
