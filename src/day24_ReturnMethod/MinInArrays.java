package day24_ReturnMethod;

public class MinInArrays {
    public static void main(String[] args) {

        int[]array={9,5,8,7,2,3,6,4};
     int min =minInArray(array);
        System.out.println(min);



    }
    public static int minInArray(int[]array){

        int min=5;
        for (int number : array) {
            if(number<min){
                min=number;
            }
        }

        return  min;


    }








}
