package day24_ReturnMethod;
import java.util.Arrays;
public class AddElement1 {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5};
        int num=6;
        addElement(nums,num);

    }

    public  static void addElement(int[] array, int a){
        int n= array.length;
        int [] newArray=new int[n+1];//increase the new array's range one more



        System.out.println(Arrays.toString(array));
        for (int i = 0; i <n ; i++) {
            newArray[i]=array[i];// we assing the elements of array to newArray
        }
        newArray[n]=a;
        System.out.println(Arrays.toString(newArray));

    }
}
