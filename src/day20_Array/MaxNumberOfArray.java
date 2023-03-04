package day20_Array;

public class MaxNumberOfArray {
    public static void main(String[] args) {



int[] numbers={10,5,4,20,1,0};
int max= numbers[0];//20
/* firstly assumed that numbers[0] is max,then looped and compared to others
                         if found bigger then assigned to max number */


       /*this is shortcut for fori...... numbers.fori==>for (int i = 0; i < numbers.length; i++) {

        }*/

        for (int i = 0; i <numbers.length ; i++) {
          if (numbers[i]>max){//if there is element in the array that is greater than the current max number
              max=numbers[i];//assigning greater number to variable max
          }


        }
        System.out.println(max);











        }



    }




