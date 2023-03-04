package day24_ReturnMethod;
import java.util.Arrays;
public class Reverse {



        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40};
            System.out.println(Arrays.toString(reverse(arr)));
        }
        public static int[] reverse(int[] array){
            int[] reverse=new int[array.length];
            int j=0;
            for (int i = array.length - 1; i >= 0; i--) {
                reverse[j++]=array[i];
            }
            return reverse;
        }
    }



