package day21_ArrayForEachLoop;

import java.util.Arrays;

public class SortPractice {
    public static void main(String[] args) {


        int[] nums={10,30,50,80,90,75,61};
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));


        System.out.println("min score:"+nums[0]);
        System.out.println("max score:"+nums[nums.length-1]);

        System.out.println("..............................................................................");

        String [] names={"Anne","Ahmet","Gunay","Maria","Sinama","Zuhal"};//a-z,A-Z,-10-10,0-9...

         Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println(".............................................................................");

        String [] names1={"anne","Ahmet","GUNAY","maria","SInama","ZUHal"};//a-z,A-Z,-10-10,0-9...

        Arrays.sort(names1);
        System.out.println(Arrays.toString(names1));

        System.out.println("....................................................................");

        int[] n1={1,6,8,4};
        int[] n2={6,1,4,8};

        boolean a1=Arrays.equals(n1,n2);
        System.out.println(a1);

        Arrays.sort(n1);
        Arrays.sort(n2);

        boolean a2=Arrays.equals(n1,n2);
        System.out.println(a2);



    }
}
