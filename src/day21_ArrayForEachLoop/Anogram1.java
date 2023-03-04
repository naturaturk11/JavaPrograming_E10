package day21_ArrayForEachLoop;

import java.util.Arrays;

public class Anogram1 {
    public static void main(String[] args) {

        String words="defg";
        String words1="gfde";


        char[]ch=words.toCharArray();
        char[]ch1=words1.toCharArray();
        System.out.println(Arrays.toString(ch));
        System.out.println(Arrays.toString(ch1));

        boolean a1=Arrays.equals(ch,ch1);
        System.out.println(a1);

        Arrays.sort(ch);
        Arrays.sort(ch1);
        System.out.println(Arrays.toString(ch));
        System.out.println(Arrays.toString(ch1));
        boolean a2=Arrays.equals(ch,ch1);
        System.out.println(a2);








    }
}
