package day21_ArrayForEachLoop;

public class AvarageNumber {
    public static void main(String[] args) {

        int[] nums={1,2,3,4,5,6,7,8,9};

        double sum=0;//1,2,3,4,5,6

        for (int num : nums) {
            sum+=num;

        }


       double avarage=sum/nums.length;


        System.out.println(avarage);

    }
}
