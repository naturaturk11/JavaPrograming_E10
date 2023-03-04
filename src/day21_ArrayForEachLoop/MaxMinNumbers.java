package day21_ArrayForEachLoop;

public class MaxMinNumbers {
    public static void main(String[] args) {

        int[] numbers={10,5,4,20,1,0};
        int max= numbers[0];//20
/* firstly assumed that numbers[0] is max,then looped and compared to others
                         if found bigger then assigned to max number */


       /*this is shortcut for fori...... numbers.fori==>for (int i = 0; i < numbers.length; i++) {

        }*/

        for (int number : numbers) {
            if(number>max){
                max=number;
            }

        }


        System.out.println(max);



    }
}
