package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {


    public static void main(String[] args) {
//solution 1
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,3,5,6,4,2,3,5,9,8,9));


        ArrayList<Integer>unique=new ArrayList<>();

        for (Integer each : list) {
          int frequency=  Collections.frequency(list,each);//FİNDS THE FREQUENCY OF EACH ELEMENT
          if(frequency==1){
              unique.add(each);
          }
        }
        System.out.println("unique = " + unique);

        System.out.println("...............................................................");


        //solution 2


        // best method to find unique element
        ArrayList<Integer>list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,1,1,2,3,5,6,4,2,3,5,9,8,9));

        ArrayList<Integer>unique1=new ArrayList<>(list1);
        unique1.removeIf(p-> Collections.frequency(list1,p)>1);
        System.out.println("unique1 = " + unique1);





    }
}
