package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElement {
    public static void main(String[] args) {

        ArrayList<String>list=new ArrayList<>();

        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("C#");
        list.add("C#");
        list.add("C#");
        list.add("Ruby");
        list.add("C++");
        list.add("C++");
        System.out.println(list);

        ArrayList<String> unique=new ArrayList<>();
        for (String each : list) {
           /* if(!(unique.contains(each))){//it is method showing the only one printed type
                unique.add(each);
            */

            if(list.indexOf(each)==list.lastIndexOf(each)){
                unique.add(each);

            }

        }
        System.out.println(unique);










    }
}
