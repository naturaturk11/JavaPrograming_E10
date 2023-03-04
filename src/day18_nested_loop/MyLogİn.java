package day18_nested_loop;

import java.util.Locale;
import java.util.Scanner;

public class MyLogİn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Username");
        String u = scan.next();

        System.out.println("Enter your password");
        String p = scan.next();

        if ((u.equalsIgnoreCase("Hasan")) && p.equalsIgnoreCase("sadeb")) {
            System.out.println("logged in");

        } else {
            for (int i = 1; i < 4; i++) {
                System.out.println("your username or password are not correct,please re enter");
                System.out.println("Enter your Username");
                u = scan.next();
                System.out.println("Enter your password");
                p = scan.next();

                if ((u.equalsIgnoreCase("hasan")) && p.equalsIgnoreCase("Sadeb")) {
                    System.out.println("logged in");
                    break;


                }


            }
            if(!(u.equalsIgnoreCase("Hasan") && p.equalsIgnoreCase(" Sadeb"))){
                System.out.println("your account is blocked, please contact to suppot team");

            }
}




    }}