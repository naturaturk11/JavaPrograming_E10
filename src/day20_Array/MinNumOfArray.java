package day20_Array;

public class MinNumOfArray {
    public static void main(String[] args) {


int[] numbers={100,500,30,40,600,80,90};
int min=numbers[0];//100 this is just assumption selected number

        for (int i = 0; i < numbers.length; i++) {


            if(numbers[i]<min){//just consider the number which is smaller one
              min= numbers[i];//smaller number will be asssigned to the variable
            }
        }
        System.out.println(min);








    }
}
