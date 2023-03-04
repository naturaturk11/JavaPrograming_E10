package day25_CustomMethod_Overloading;

public class SumOFTwoNumbers {

    public static void main(String[] args) {

    
    int sum=sumOfTwoNumbers(10,20);
        System.out.println(sum);
        System.out.println();

        int sum2=sumOfThreeNumbers(10,20,30);
        System.out.println("sum2 = " + sum2);





    }
    /* 1. create a method that can find the sum of two numbers
                       method name:sumOf2Numbers  */


    public static int sumOfTwoNumbers(int num1,int num2){

        return  num1+num2;
    }


      /*2. create a method that can find the sum of three numbers
    method name: sumOf3Numbers*/

     public static int sumOfThreeNumbers(int num1,int num2,int num3){
         return num1+num2+num3;

     }

  /*3. create a method that can find the sum of four numbers
    method name: sumOf4Numbers*/

    public static int sumOfFourNumbers(int num1,int num2,int num3,int num4){

        return  num1+num2+num3+num4;
    }
























}
