package day51Map;

import java.util.*;

public class ExE {

    public static void main(String[] args) {

        Map< Integer,String> hashMap=new HashMap<>();

        hashMap.put(2,"john");
        hashMap.put(3,"jemal");
        hashMap.put(20,"Kari");
        hashMap.put(5,"remzi");
        hashMap.put(4,"kadir");
        hashMap.put(8,"zeyno");
        hashMap.put(null,"ahmet");
        hashMap.put(87,null);
        hashMap.put(null,null);

        System.out.println("hashMap = " + hashMap);



        System.out.println("......................................................");
        Map<Integer,String>linkedHashMap=new LinkedHashMap<>();

        linkedHashMap.put(2,"john");
        linkedHashMap.put(3,"jemal");
        linkedHashMap.put(20,"Kari");
        linkedHashMap.put(5,"remzi");
        linkedHashMap.put(4,"kadir");
        linkedHashMap.put(8,"zeyno");
        linkedHashMap.put(null,"ahmet");
        linkedHashMap.put(87,null);
        linkedHashMap.put(null,null);
        linkedHashMap.put(null,"ayse");

        System.out.println("linkedHashMap = " + linkedHashMap);


        System.out.println(".....................................................");
        Map<Integer,String> treeMap=new TreeMap<>();

        treeMap.put(2,"john");
        treeMap.put(3,"jemal");
        treeMap.put(20,"Kari");
        treeMap.put(5,"remzi");
        treeMap.put(4,"kadir");
        treeMap.put(8,"zeyno");
        //treeMap.put(null,"ahmet");
        treeMap.put(87,null);
        //treeMap.put(null,null);
        //treeMap.put(null,"ayse");


        System.out.println("treeMap = " + treeMap);


        System.out.println("....................................");
        Map<Integer,String>hashtable=new Hashtable<>();

        hashtable.put(2,"john");
        hashtable.put(3,"jemal");
        hashtable.put(20,"Kari");
        hashtable.put(5,"remzi");
        hashtable.put(4,"kadir");
        hashtable.put(8,"zeyno");
        //hashtable.put(null,"ahmet");
        //hashtable.put(87,null);
        //hashtable.put(null,null);
        //hashtable.put(null,"ayse");

        System.out.println("hashtable = " + hashtable);


        System.out.println("hashtable.get(2) = " + hashtable.get(2));




        System.out.println("....................................");

          hashtable.put(2,"sabiha");



          Map<String,Integer> students=new HashMap<>();
        System.out.println("students.size() = " + students.size());
        students.put("AYSU",56);
        students.put("hercai",58);
        students.put("gery",53);
        students.put("AYSU",59);
        System.out.println("students.size() = " + students.size());
        System.out.println("students.get(\"AYSU\") = " + students.get("AYSU"));

        students.replace("AYSU",28);
        System.out.println("students = " + students);
        students.remove("AYSU");
        System.out.println(students);

        System.out.println(students.containsKey("hasan"));
        System.out.println(students.containsKey("hercai"));
        System.out.println(students.containsValue(100));

        System.out.println(students.isEmpty());

        Map<String,Integer> map1=new HashMap<>();
        map1.putAll(students);

        Map<String,Integer> map2=new HashMap<>();
        map2.putAll(students);



        System.out.println(map1);
        System.out.println(map2);


        System.out.println(map2==map1);
        System.out.println(map2.equals(map1));

        System.out.println(".....................................");


        Map< String,Integer> hashMap1=new HashMap<>();

        hashMap1.put("john",86);
        hashMap1.put("jemal",73);
        hashMap1.put("Kari",59);
        hashMap1.put("remzi",98);
        hashMap1.put("kadir",87);
        hashMap1.put("zeyno",90);
        hashMap1.put("ahmet",40);


      Set<String>keys  =hashMap1.keySet();

        /*for (String key : keys) {

            System.out.println(hashMap1.replace(key,hashMap1.get(key)+10));
        }
        */

        for (String eachKey : hashMap1.keySet()) {
            Integer eachValue=hashMap1.get(eachKey);
           if(eachValue<90){
               System.out.println(eachKey);
           }
        }
        System.out.println(hashMap1);

        Map<String,Integer>earylBirds=new HashMap<>();
        Map<String,Integer>angryBirds=new HashMap<>();


        for (String eachKey : hashMap1.keySet()) {
            Integer eachValue=hashMap1.get(eachKey);

            if(eachValue>=90){
                earylBirds.put(eachKey,eachValue);
            }else {
                angryBirds.put(eachKey,eachValue);

            }
        }
        System.out.println(earylBirds);
        System.out.println(angryBirds);


        Set<String>names  =hashMap1.keySet();

        System.out.println(".....................................");

        List<Integer>scores=new ArrayList<>(hashMap1.values());
        System.out.println(scores);


        for (Integer value : hashMap1.values()) {
            System.out.println(value);
        }

        System.out.println("..................................................");

         int maxScore=Integer.MIN_VALUE;
         int minScore=Integer.MAX_VALUE;

        for (Integer score : hashMap1.values()) {
            if(score>maxScore){
               maxScore=score;

            }
        }
        System.out.println("maxScore = " + maxScore);
        for (Integer score : hashMap1.values()) {
            if(score<minScore){
                minScore=score;

            }
        }
        System.out.println("minScore = " + minScore);


         int max=Collections.max(hashMap1.values());
         int min=Collections.min(hashMap1.values());
        System.out.println("min = " + min);
        System.out.println("max = " + max);


        System.out.println(".............................................");

        Map< String,Integer> hashMap2=new HashMap<>();

        hashMap1.put("john",86);
        hashMap1.put("jemal",73);
        hashMap1.put("Kari",59);
        hashMap1.put("remzi",98);
        hashMap1.put("kadir",87);
        hashMap1.put("zeyno",95);
        hashMap1.put("ahmet",40);



        int  count=0;

        for (Integer eachscore : hashMap1.values()) {
            if(eachscore>=95){
                count++;

            }
        }
        System.out.println("count = " + count);


      /*  for (String eachKey : hashMap1.keySet()) {
         Integer eachValue=hashMap1.get(eachKey);

          if(eachValue>=90){
              count++;
          }
        }
        System.out.println("count = " + count);
*/

        for (Map.Entry<String, Integer> entry : hashMap1.entrySet()) {
            //System.out.println(entry.getValue());
            System.out.println(entry);
        }


        System.out.println(".....................................................");

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");


        for (String key : employeeMap.keySet()) {
            if(employeeMap.get(key).equalsIgnoreCase("M")){
                employeeMap.replace(key,"Male");
            }
        }

        for (String key : employeeMap.keySet()) {
            if(employeeMap.get(key).equalsIgnoreCase("F")){
                employeeMap.replace(key,"Female");
            }
        }
        System.out.println("employeeMap = " + employeeMap);


        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if(entry.getValue().equalsIgnoreCase("m")){
                entry.setValue("Male");
            }
        }
        System.out.println("employeeMap = " + employeeMap);


        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if(entry.getValue().equalsIgnoreCase("f")){
                entry.setValue("Female");

            }
        }


        System.out.println(".................................................");


        for (Map.Entry<String, String> pair : employeeMap.entrySet()) {
            String eachKey=pair.getKey();
            String eachValue=pair.getValue();
            if(eachValue.equals("Female")){
                System.out.println("eachKey = " + eachKey);
            }
        }

        System.out.println("................................................");
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 145000);
        map.put("Conor", 85000);
        map.put("Josh", 145000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);


        int maxSalary=Integer.MIN_VALUE;
        String name1="";

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
           String eachKey=pair.getKey();
           Integer eachValue=pair.getValue();
           if(eachValue>maxSalary){
               maxSalary=eachValue;
               name1=eachKey;
           }
        }
        System.out.println("name1 = " + name1);


        System.out.println("............................................");
        for (Integer value : map.values()) {
            if(value>maxSalary){
                maxSalary=value;

            }
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if(pair.getValue()==maxSalary){
                System.out.println(pair.getKey());
            }
        }

        int maxSalary1=Collections.max(map.values());
        System.out.println("maxSalary1 = " + maxSalary1);


        System.out.println(".....................................");

        int minSalary=Integer.MAX_VALUE;
        String name2="";


        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            Integer eachValue1=pair.getValue();
            String eachKey=pair.getKey();

            if(eachValue1<minSalary){

                minSalary=eachValue1;
                name2=eachKey;

            }

        } System.out.println(name2);


        System.out.println(".........................................");

        int count1=0;


        for (Integer evalue : map.values()) {
            if(evalue>=120000&& evalue<=150000){
                count1++;
            }
        }

        System.out.println(count1);


        System.out.println("...................................");

        for (Map.Entry<String, Integer> eachPairs : map.entrySet()) {
            if(eachPairs.getValue()<118000){
                System.out.println(eachPairs.getKey());
            }
        }


        System.out.println(".......................................");

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
          if(eachEntry.getValue()<120000){
              System.out.println(eachEntry.setValue(eachEntry.getValue() + 10000));
          }
        }


        System.out.println("..............................................");

        String str = "bbcccaaaaa";
        //           bca
        //           235
        //Collections.frequency()

        String[]arr=str.split("");
        Map<String,Integer> result=new LinkedHashMap<>();


        for (String each : arr) {
            result.put(each,Collections.frequency(Arrays.asList(arr),each));
        }

        //System.out.println(result);
        ArrayList<String> group1 = new ArrayList<>(Arrays.asList( "Duygu","Magda","Farangez","Edison","Kerem","Farangis" ));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList( "Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat" ));
        ArrayList<String> group9 = new ArrayList<>(Arrays.asList( "Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem" ));
        ArrayList<String> group24 = new ArrayList<>(Arrays.asList( "Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas" ));
        ArrayList<String> group5 = new ArrayList<>(Arrays.asList("Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene" ));



        // pair: Id & names of students

        Map<Integer, ArrayList<String>> groups = new TreeMap<>();
        groups.put(1, group1);
        groups.put(2, group2 );
        groups.put(9, group9);
        groups.put(24, group24);
        groups.put(5, group5);

        System.out.println(groups);


        System.out.println(groups.get(2).get(3).charAt(3));



    }
}
