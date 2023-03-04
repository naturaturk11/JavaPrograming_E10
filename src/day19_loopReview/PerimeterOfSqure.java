package day19_loopReview;

import java.util.Scanner;

public class PerimeterOfSqure {
    public static void main(String[] args) {
        /*Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers, terminate the program after displaying the error
				message
				"Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry*/

        Scanner scan=new Scanner(System.in);

        while (true){
            System.out.println("enter the side of square");
            int a=scan.nextInt();


            if(a==0 || a<0){
                System.out.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }
            if(a>0){
                System.out.println("Area of square:"+a*a);
                System.out.println("Perimeter of square:"+4*a);
            }
            System.out.println("would you like to calculate another square(yes/no");
            String b=scan.next().toLowerCase();

            if(b.equals("yes")||b.equals("no")){
                if(b.equals("yes")){
                    System.out.println("repeat the previous steps");
                }else if(b.equals("no")){
                    System.out.println("Thank you for using Cydeo Square Calculator APP");
                    break;
        }

            }
            if(!(b.equals("yes") || b.equals("no"))){
                System.out.println("re-enter until user provides a valid entry");
            }

        }





    }
}
