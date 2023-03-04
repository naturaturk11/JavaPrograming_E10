package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class OverloadingIntro {


    public static void main(String[] args) {


        int[] intArray={1,2,3,4,-1};
        Arrays.sort(intArray);
        double[] doubleArray={10,5 ,11,5, 4,5};
         Arrays.sort(doubleArray);
        char[]charArray={'a','b','c','d'};
        Arrays.sort(charArray);
        sumOfNumbers(10,20,30,40);

     int sum1=sumOfNumbers(10,20);

     int sum2=sumOfNumbers(10,20,30);

     int sum3=sumOfNumbers(10,20,30,40);

     double sum4=sumOfNumbers(10.2,45.6);

     double sum5=sumOfNumbers(1.2,4.6,3.4);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
        System.out.println(sum5);





    }








    public static int sumOfNumbers(int num1,int num2){
        return  num1+num2;

    }
    public static double sumOfNumbers(double num1,double num2) {
        return num1 + num2;
    }

    public static int sumOfNumbers(int num1,int num2,int num3){
        return num1+num2+num3;
    }


    public static int sumOfNumbers(int num1,int num2,int num3,int num4){
        return  num1+num2+num3+num4;


    }

    public static double sumOfNumbers(double num1,double num2,double num3) {
        return num1 + num2+num3;
    }



    public static double sumOfNumbers(double num1,double num2,double num3,double num4) {
        return sumOfNumbers(num1,num1,num3)+num4;// this is another method to add onr more element tothe arrays
    }







}
