package day19_loopReview;

import java.util.Scanner;

public class PerimeterAndAreaOfCİRCLE {
    public static void main(String[] args) {
        /*Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message
				"Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry*/


        Scanner scan=new Scanner(System.in);

        while (true){
            System.out.println("enter the radious of the circle");

            int r=scan.nextInt();
            double p=3.14;
            double result=0;

            if(r<0 || r==0){
                System.err.println("Invalid entry for the radius of the circle");
                System.exit(0);
            }else{
                if(r>0){
                    System.out.println("Area of circle :"+ p*r*r);
                    System.out.println("Perimeter of circle : "+2*p*r);
                    System.out.println("Diameter of circle: "+2*r);
                }




            }

            System.out.println("Would you like to calculate another circle(yes/no");
            String a=scan.next();

            if(a.equalsIgnoreCase("yes")||a.equalsIgnoreCase("no")){
                if(a.equalsIgnoreCase("yes")){
                    System.out.println("repeat the previous step");

                } else if (a.equalsIgnoreCase("no")) {
                    System.out.println("thank you for using Cydeo CİRCLE Calculator APP");
                    break;

                }
            }
            if(!(a.equalsIgnoreCase("yes")||a.equalsIgnoreCase("no"))){
                System.out.println("invalid entry,please re- enter");
            }


        }


















    }
}

