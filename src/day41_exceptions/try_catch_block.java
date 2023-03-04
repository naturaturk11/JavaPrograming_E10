package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class try_catch_block {


    public static void main(String[] args) {

        System.out.println("Test Started");
        try {

            System.out.println(9 / 0);
            System.out.println("Try block");

        } catch (ArithmeticException e) {

            System.out.println("Catch block");
            System.out.println("ArithmeticException was occurred");


        }
        System.out.println("Test complated");


        System.out.println("...............................................");

        System.out.println("test2 started");

        int[]numbers={1,2,3,4,5,6};



        try {
            System.out.println(numbers[200]);

        }catch (RuntimeException r){

           // System.out.println("Catch Block");
            //System.out.println("RUN TİME exception was occurred");



            //preferable ones is this
             r.printStackTrace();//to get more detail reports  this method is used

            //alternativ method to take deatiled reports....System.out.println(r.getMessage());//look the result after executing
            System.out.println("Test complated");

        }

        System.out.println("....................................");


        System.out.println("Test3 started");

         try {
             System.out.println("Cydeo".substring(2,0));
         }catch (RuntimeException a){
             a.printStackTrace();
         }
        System.out.println("Test3 complated");


        System.out.println("hello");

        try {//just click the warning advised in red light and give the formula automatically
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Cydeo");

        System.out.println(".............................................");


        try {
            FileInputStream file=new FileInputStream("HASAN");
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }
        System.out.println("Succeeded");


        try {
            FileInputStream file1=new FileInputStream("HASAN");
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }
        System.out.println("need details");

    }

}