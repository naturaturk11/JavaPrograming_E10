package day20_Array;

public class AvarageNumber {
    public static void main(String[] args) {


        /* AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number*/


         int[] nums={1,2,3,4,5,6,7,8,9};
         double sum=0;//1,2,3,4,5,6


        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];

        }

        double avarageNumbers=sum/nums.length;


        System.out.println("avarageNumbers = " + avarageNumbers);





    }
}
