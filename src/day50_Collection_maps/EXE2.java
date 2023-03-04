package day50_Collection_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class EXE2 {
    public static void main(String[] args) {


        Integer[]id={2,5,8,9,6,3};
        Integer[]arr={1,2,3,4,5,6,8};
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(arr));
        System.out.println("numbers = " + numbers);
        numbers.addAll(Arrays.asList(id));
        System.out.println("numbers = " + numbers);

        Iterator<Integer>sa=numbers.iterator();

        while (sa.hasNext()){
            Integer each=sa.next();
            if(each%2!=0){
                sa.remove();
            }
        }

        System.out.println("numbers = " + numbers);

        System.out.println("...........................................");
        ArrayList<Integer>numbers1=new ArrayList<>();
        numbers1.addAll(Arrays.asList(arr));
        System.out.println("numbers1 = " + numbers1);
        numbers1.addAll(Arrays.asList(id));
        System.out.println("numbers1 = " + numbers1);

        numbers1.removeIf(p->p<=4);
        System.out.println("numbers1 = " + numbers1);


    }
}
