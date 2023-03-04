package day10NestedIfIntro;

public class TernarieIntro {


    public static void main(String[] args) {

        int n=100;
        if(n%2==0){
            System.out.println("Even");}else{
            System.out.println("Odd");}


        System.out.println(".............................................");

        String result1=(n%2==0)? "Even": "Odd";
        System.out.println(result1);

        System.out.println("........................................");


        int age=17;
         /**if(age>=21){
             System.out.println("Elligible");}else {
             System.out.println("Not Elligible");}
         */

         String Result2= (age>=21)?"Elligible" : "Not Elligible";
        System.out.println(Result2);


        System.out.println("......................................");

        int number= -25;

/**
         if(number>0){
             System.out.println("Positve");} else if (number<0) {
             System.out.println("Negativ");}else{
             System.out.println("Zero");}*/

        String result3= (number>0)? "Positiv" :(number<0)? "Negativ" : "Zero";

        System.out.println(result3);

        //turniry should be used only in the statement
        //oncondition that each used data type should be the same









         }


    }



