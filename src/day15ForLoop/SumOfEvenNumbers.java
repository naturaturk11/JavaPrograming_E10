package day15ForLoop;

public class SumOfEvenNumbers {
    public static void main(String[] args) {

        /*Write a program that can return the sum of even numbers between 1 to 100

         */

        int evenNumbers = 0;
        int oddNumbers=0;
        for (int i = 0; i < 100; i ++) {
            if (i % 2 == 0) {
            evenNumbers+=i;//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!do not forget

            } else if (i%2!=0){
               oddNumbers+=i;
            }


        } System.out.println(evenNumbers);
        System.out.println(oddNumbers);
    }}
