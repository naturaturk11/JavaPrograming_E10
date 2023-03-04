package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 3, 8, 5, 6, 7));//asList is important

        System.out.println("list = " + list);

        System.out.println("......................................................");

        list.removeAll(Arrays.asList(3, 5, 8));

        System.out.println("list = " + list);


        System.out.println("..........................................................");


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100, 200, 300, 400, 500, 600, 700, 200, 100, 300));
        numbers.retainAll(Arrays.asList(100, 200, 300));

        System.out.println("numbers = " + numbers);


        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "SCRUM MASTER", "BA", "BA"));
        jobTitles.retainAll(Arrays.asList("BA", "SDET"));
        System.out.println("jobTitles = " + jobTitles);


        System.out.println("...................................................");

        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 78, 91, 0, 10, 0, 2, 6));


        //alternative ways of contains multiple element, it is the easiest way
        boolean r1 = numbers1.containsAll(Arrays.asList(10, 2, 6));

        //this is long but valid method
        boolean r2 = numbers1.contains(10) && numbers1.contains(2) && numbers1.contains(6);


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);


        System.out.println("..........................................................");


        String[] names = {"james", "jack", "daniel", "shay", "berna"};
        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));
                                                     //namesList.addAll(Arrays.asList(names));

        System.out.println("namesList = " + namesList);


        System.out.println(".......................................................");

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list2);


        System.out.println("...................................................");

        //converting primitive array to array list!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));
        System.out.println();                       //converting primitive array to array list
        System.out.println("list3 = " + list3);


    }

    public static ArrayList<Integer> convertArrayToArrayList(int[]array){
        ArrayList<Integer> list=new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }
        return list;
        
        
    }


}
