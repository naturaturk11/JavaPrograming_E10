package day17WhileDoWhile;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {
        //username:Cydeo
        //password:Cydeo123

        int attempt=3;
        //while(invalid  and hasAttempts

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your username");
        String u=scan.next();

        System.out.println("Enter your password");
        String p=scan.next();

        if(u.equals("Cydeo") && p.equals("Cydeo123")){
            System.out.println("Logged in");}
           else{
                 int attempts=3;//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!careful this point
                 while (!(u.equals("Cydeo") && p.equals("Cydeo123"))&&attempts>0){
                     if(attempts==1){
                         System.out.println("This is the last chance to enter your password");


                     }
                     System.out.println("Incorrect username or password,please re-enter");
                     u=scan.next();
                     System.out.println("Enter your password");
                     p=scan.next();
                     attempts-=1;


                     }
            if((u.equals("Cydeo") && p.equals("Cydeo123"))){
                System.out.println("logged in");}
            else{//if credentials are not valid
                System.out.println("Your account is locked"); }

                 }



        }







    }

