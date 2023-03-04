package day50_Collection_maps;

import java.util.*;

public class Exe3 {
    public static void main(String[] args) {



        String[]arr={"al","bi","c","di","e","f"};
        List<String> list=new ArrayList<>();
        list.addAll(Arrays.asList(arr));

        System.out.println("list = " + list);

        Iterator<String>item=list.iterator();

        while (item.hasNext()){
            String each=item.next();
            if (each.contains("a")||each.contains("i")){
                item.remove();
            }
        }

        System.out.println("list = " + list);

        list.removeIf(p->p.contains("i")||p.contains("a"));
        System.out.println("list = " + list);


        System.out.println(".....................................");


        String[]arr1={"al","ver","sat","tart","vur","vur","kır"};
        Set<String>num=new TreeSet<>();
        num.addAll(Arrays.asList(arr1));
        System.out.println("num = " + num);
        num.removeIf(p->p.contains("t"));
        System.out.println("num = " + num);
        Collection<String>num2=(TreeSet<String>)num;
        System.out.println("num2 = " + num2);

        System.out.println(".................................................");

        String[]arr2={"al","ver","sat","tart","vur","vur","kır"};
        List<String>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(arr2));
        Collection<String>collection=Arrays.asList(Arrays.toString(list2.toArray()));
        System.out.println("collection = " + collection);
    }
}
