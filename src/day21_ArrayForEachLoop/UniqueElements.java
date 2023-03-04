package day21_ArrayForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {


        String[] word={"java","gh","iphone","C#","java","hi","iphone"} ;



        for (String each : word) {
            int count=0;//the places of temp var should be here
            for (String element : word) {
                if(element.equals(each)){
                    count++;
                }


            }
            if(count==1){
                System.out.println(each);


            }

        }








    }
}
