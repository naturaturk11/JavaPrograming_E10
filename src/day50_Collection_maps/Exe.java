package day50_Collection_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Exe {

    public static void main(String[] args) {


        ArrayList<String>names=new ArrayList<>();
        names.addAll(Arrays.asList("hasanşllk","metin","Selim","kadir"));


        Iterator<String>list= names.iterator();

        while (list.hasNext()){
            String each=list.next();
            if(each.length()>5){
                list.remove();

            }
        }
        System.out.println("names = " + names);
    }





}
