package week2Review09_17_2022;

public class TempeturConverter {
    public static void main(String[] args) {
        /**
         6. Create class named "TemperatureConverter" and make a main method

         - Write a Java program to convert temperature from Fahrenheit to Celsius degree
         - Input a degree in Fahrenheit: 212

         Formula :         C = (5(F-32))/9

         Expected Output:
         212.0 degree Fahrenheit is equal to 100.0 in Celsius
          */

   double fahreneit= 212;
   double celcious= (5*(fahreneit-32))/9;// here is multiple mark was added

        System.out.println(fahreneit+" degree Fahrenheit is equal to " +celcious +"  in Celsius");


    }




}
