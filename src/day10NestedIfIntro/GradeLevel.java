package day10NestedIfIntro;

public class GradeLevel {
    public static void main(String[] args) {

       /* 1. Create a class called GradeLevel, Given a number(byte) grade level
        determine and print which school type someone is in.
                grade level and types are:
        1-5: Elementary school
        6-8: Middle school
        9-12: High school
        13-16: College
        17-18: Grad School
        For Any Other grade: Invalid grade level given
        NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
                STATEMENT
*/
     byte number= 18;

     if(number>=1 && number<=18)
     { if(number>=1 && number<=5){
         System.out.println(" Elementry Scholl");}
     else if (number >= 6  && number<=8){
         System.out.println(" Mİddle Scholl");}
     else if ( number>=9 && number<=12) {
         System.out.println(" High Scholl");}
     else if ( number>=13 && number<=16) {
         System.out.println(" Collage");}
     else {
         System.out.println(" Grad School");}

     }else{System.out.println("Invalid grade");

     }

        System.out.println("........................................................");
        String result= (number>=1 && number<=18)?
                (number>=1 && number<=5)? " Elementry Scholl"
                :(number >= 6  && number<=8)?" Mİddle Scholl"
                :( number>=9 && number<=12)? " High Scholl"
                :( number>=13 && number<=16)? " Collage"
                : " Grad School": "Invalid grade";
        System.out.println(result);

        System.out.println(".....................................................");

        String result1="";
        if(number>=1 && number<=18) {
            if (number >= 1 && number <= 5) {
                result1 = "Elementry Scholl";
            } else if (number >= 6 && number <= 8) {
                result1 = " Mİddle Scholl";
            } else if (number >= 13 && number <= 16) {
                result1 = " Collage";
            } else if (number >= 9 && number <= 12) {
                result1 = " High Scholl";
            } else {
                result1 = " Grad School";
            }

        }else {result1="invalid grade";}

        System.out.println(result1);

    }}









