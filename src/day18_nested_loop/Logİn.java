package day18_nested_loop;

import java.util.Scanner;

public class Logİn {
    public static void main(String[] args) {

        /*You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

                Ask the user to enter their credentials.
                        If credentials are matched, your program should print "Logged in."
                        If the credentials are not matched, the program should allow the user
                        to have three attempts to enter correct credentials and if
                        all three attempts are failed, then print "Your account is locked."*/


        Scanner scan=new Scanner(System.in);
        System.out.println("enter your username");
        String u=scan.next();

        System.out.println("enter your password");
        String p=scan.next();



        if(u.equals("Cydeo") &&( p.equals(" WoodenSpoon"))){
            System.out.println("log in");


        }else{
            for (int i = 1; i <4 ; i++) {
                System.out.println("your username or password incorrect");
                System.out.println("please enter your username");
                u = scan.next();
                System.out.println("please enter your password");
                p = scan.next();

                if ((u.equals("Cydeo") && (p.equals(" WoodenSpoon")))) {
                    System.out.println("logged in");
                    break;
                }

            }
                if(!(u.equals("Cydeo") && p.equals(" WoodenSpoon"))){
                    System.out.println("your account is blocked, please contact to support team");

                }
        }














    }}

