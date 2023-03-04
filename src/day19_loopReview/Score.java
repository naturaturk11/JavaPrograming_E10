package day19_loopReview;

import java.util.Scanner;

public class Score {

    public static void main(String[] args) {

        /*4. Write a program for grade calculator:
			1. Ask the user "Enter your score"
				If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

			 2. Display the grade of the student.
			 		90 ~ 100 ==> A
			 		80 ~ 89 ==> B
			 		70 ~ 79 ==> C
			 		60 ~ 69 ==> D
			 		0 ~ 59 ==> F

			2. Ask the user would you like to continue
				If "yes" --> repeat the previous steps
				If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"*/

        Scanner scan=new Scanner(System.in);



       while (true){
           System.out.println("Enter your score");
           int s=scan.nextInt();


           if(s<=100 && s>=90){
               System.out.println("A");
           } else if (s<90 && s>=80) {
               System.out.println("B");

           } else if (s<80 && s>=70) {
               System.out.println("C");
           } else if (s<70 && s>=60) {
               System.out.println("D");
           }else {
               System.out.println("F");
           }

           System.out.println("would you like to continue");
           String c=scan.next().toLowerCase();

           if(c.equals("yes") ||c.equals("no")){
               if(c.equals("yes")){
                   System.out.println("repeat the previous steps");

               }else if(c.equals("no")){
                   System.out.println("Thank you for using Cydeo Grade Calculator APP");
                   break;

               }
           }if(!(c.equals("yes") ||c.equals("no"))){
               System.out.println("Invalid Entry");
               System.exit(0);
        }

    }
}}
