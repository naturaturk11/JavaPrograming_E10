package day24_ReturnMethod;

public class FrequencyInArray {
    public static void main(String[] args) {

        int[] array ={1,1,1,1,1,2,2};
         frequency(array,1);


    }
    /* create method that accepts one integer array and one integer number and returns
     the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5
*/
public static int frequency(int[]array,int number){
    int frequency=0;

    for (int each : array) {
        if(each==number){
            frequency++;
        }


    }
    System.out.println(frequency);
    return  frequency;


}





}
