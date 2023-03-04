package day19_loopReview;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        /*Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative, terminate the program after displaying the error message "Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144, terminate the program after displaying the error message
					 "Invalid Entry for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%, terminate the program after displaying the
					error message "Invalid Entry for state tax Rate"


			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"*/


        Scanner scan=new Scanner(System.in);
        while (true){
            double hourlyRate=0;
            double hours=0;
            int weeklyHour=0;

            System.out.println("How much you make an hour");
             hourlyRate=scan.nextDouble();

            if(hourlyRate<=0){
                System.err.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }

            System.out.println("How many hours do you work per week?");
            weeklyHour=scan.nextInt();


            if(weeklyHour<1||weeklyHour>144){
                System.err.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }
            System.out.println("Enter your state tax rate");
            double stateRate=scan.nextDouble();

            if(stateRate<0 || stateRate>0.1){
                System.err.println("Invalid Entry for state tax Rate");
                System.exit(0);

            }
            System.out.println("gross salary: "+hourlyRate*weeklyHour*52);
            System.out.println("federaltax: "+(hourlyRate*weeklyHour*52)*26/100);
            System.out.println("state tax: "+(hourlyRate*weeklyHour*52)*0.01);
            System.out.println("total tax: "+((hourlyRate*weeklyHour*52)*26/100)+((hourlyRate*weeklyHour*52)*2/100));
            System.out.println("net income: "+((hourlyRate*weeklyHour*52)-(hourlyRate*weeklyHour*52)*26/100)+((hourlyRate*weeklyHour*52)*2/100));

            System.out.println("Would you like to continue?(yes/no");
            String ans=scan.next().toLowerCase();

            if(ans.equals("yes") || ans.equals("no")){
                if(ans.equals("yes")){
                    System.out.println("repeat all the previous steps");
                } else if (ans.equals("no")) {
                    System.out.println("Thank you for using Cydeo Salary Calculator APP");
                    break;

                }
            }
            if(!(ans.equals("yes") || ans.equals("no"))){
                System.out.println("Invalid Entry");
                System.exit(0);

            }
        }




    }
}
