package day15ForLoop;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {


          /*Task 2: Use a loop to create a guest list for the party. Ask the user to enter the name of the first guest,
          store the name into the guest list and ask if they want to enter another guest name.
          If the user says “yes” then ask them for the next guest's name and repeat the process
          If the user says “no” then stop asking for names and display the final guest list

Example Flows:

Please enter the guest's name:
  Nick
Do you want to enter another guest's name?
  yes
Please enter the guest's name:
  Linda
Do you want to enter another guest's name?
   no
Guests' list: Nick, Linda*/

        Scanner scan=new Scanner(System.in);
        String guestName="";



       while (true) {
           System.out.println("enter the name of guest");
           String firstName = scan.next();
           guestName = firstName;
           System.out.println("would you like to enter another guest name");
           String ans = scan.next();

           while (ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("no")) {
               if (ans.equalsIgnoreCase("no")) {
                   System.out.println("Guests' list: " + guestName);
                  System.exit(0);
               } else if (ans.equalsIgnoreCase("yes")){

                   System.out.println("enter the name of guest");
                   String secondName = scan.next();
                   guestName = firstName + ", " + secondName;
                   System.out.println("would you like to enter another guest name");
                    ans = scan.next().toLowerCase();
               }




           }


       }




    }}