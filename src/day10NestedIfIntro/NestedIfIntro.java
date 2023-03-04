package day10NestedIfIntro;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 400;


        if (score >= 60 && score <= 100) {//if score is valid
            if (score >= 60) {//if student passes the exam
                System.out.println("Passed");
            } else {//if the student fails
                System.out.println("Failed");
            }


        } else {//if the score is not valids
            System.out.println("Invalid score");


        }

        System.out.println("..................................................");


        int age = 19;
        boolean hasId = true;
        if (hasId) {
            if (age >= 21) {
                System.out.println("Eligible to buy alcohol");
            } else {
                System.out.println("Not ELIGIBLE TO BUY ALCOHOL");
            }
        } else {//if the person does not have an ID
            System.out.println("You must have an ID to buy alcohol");
        }

        System.out.println("........................................");





        int  number=-1;
        if(number>=1 && number<=7){//pre condition
            if(number==1){
                System.out.println("Monday");}
            else if (number==2) {
                System.out.println("Tuesday");}
            else if (number==3) {
                System.out.println("Wednsday");}
            else if (number==4) {
                System.out.println("Thursday");}
            else if (number==5) {
                System.out.println("Friday");}
            else if (number==6) {
                System.out.println("Saturday");}
            else {
                System.out.println("Sunday");}

            }// else should be after this bracet here added be care
        else {System.out.println(" number is Unvalid");}


        }
}