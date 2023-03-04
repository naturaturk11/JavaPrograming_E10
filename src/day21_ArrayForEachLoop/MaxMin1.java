package day21_ArrayForEachLoop;

public class MaxMin1 {
    public static void main(String[] args) {

        int[] nums={1,2,3,4,5,6,7,8,9,10};
        int max=nums[0];

        for (int each : nums) {
            if(each>max){
                max=each;
            }

        }
        System.out.println(max);

        System.out.println("....................................................................................");

         int min=nums[0];

        for (int each1 : nums) {
            if(each1<min){
                min=each1;
            }
        }
        System.out.println(min);






    }
}
