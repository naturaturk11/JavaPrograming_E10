package day20_Array;

public class UniqueElement {
    public static void main(String[] args) {

       String[] word={"java","gh","iphone","C#","java","hi","iphone"} ;

        for (int j = 0; j < word.length; j++) {
            int frequency=0;
            String element=word[j];//j element is placed

            for (int i = 0; i < word.length; i++) {
                if (word[i].equals(element)) {//word[i]...care about that
                    frequency++;
                }


            }
            if(frequency==1){
                System.out.println("element = " + element);
            }



        }







    }
}
