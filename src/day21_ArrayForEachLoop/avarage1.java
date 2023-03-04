package day21_ArrayForEachLoop;

public class avarage1 {


    public static void main(String[] args) {


        int []nums={10,50,70,90,750,690};
        double sum=0;


        for (int each : nums) {
            sum+=each;
        }

        double avarage=sum/nums.length;


        System.out.println(avarage);
    }
}
