package day24_ReturnMethod;

public class MaxNumberInArray {
    public static void main(String[] args) {

       int []array={1,2,3,4,6,5,7,8,9};
       int max=maxInArray(array);
        System.out.println(max);




    }
    // 2. create a method that can return the maximum number from an array of integers
public static int maxInArray(int[]array){
     int max=0;
    for (int each : array) {
        if(each>max){
            max=each;
        }

    }

    return  max;

}



}
