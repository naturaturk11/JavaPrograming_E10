package day14String2;

import java.util.Scanner;

public class Try1 {
    public static void main(String[] args) {



                Scanner scan = new Scanner(System.in);
                System.out.println("Enter your first name");
                String firstname = scan.next();

                System.out.println("Enter your surname");
                String lastname = scan.next();

                char f = firstname.charAt(0);
                char l = lastname.charAt(0);
                System.out.println(f + "." + l);


                scan.close();


            }

        }



