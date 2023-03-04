package day24_ReturnMethod;

public class RetenMethodPractice2 {


    public static void main(String[] args) {

        //create a function that can calculate the grade
       String str1= grade(81);




        /*
        check the grade
        'A' ======>Excelllent
        'B'=======>GREAT
        .......
        */

       if(str1.equals("A")){
           System.out.println("Excellent");
       } else if (str1.equals("B")) {
           System.out.println("Great");

       } else if (str1.equals("C")) {
           System.out.println("Good");
       } else if (str1.equals("D")) {
           System.out.println("Passed");
       }else {
           System.out.println("Try Again");
       }


    }

    public static String grade(int score){


        String result="";
        if(score>100|| score<0){
            System.out.println("Invalid");
        }else {
            result=(score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";
        }

        return result;


    }





}
