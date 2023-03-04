package day20_Array;

public class NunDuplicate {
    public static void main(String[] args) {

        int[]numbers={1,2,1,4,5,3,4,5,6};





        for (int i = 0; i < numbers.length; i++) {
            int frequency=0;
            int number=numbers[i];


            for (int j = 0; j < numbers.length; j++) {
                if(numbers[j]==number){
                    frequency++;
                }

            }if(frequency==1){
                System.out.println(number);
            }
        }



    }
}
