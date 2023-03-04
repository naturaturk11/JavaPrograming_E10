package day21_ArrayForEachLoop;

import java.util.Arrays;

public class CommonValue {
    public static void main(String[] args) {

        int[]number={1,9,3,7,5};
        int[]digit={5,3,4,9,6};
        int temp=0;
        for (int each : number) {
            for (int element : digit) {
                if(each==element){
                    System.out.println(each);
                    temp+=each;
                }

            }
        } System.out.println(temp);






    }
}
