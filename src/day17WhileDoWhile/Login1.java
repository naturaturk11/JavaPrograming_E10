package day17WhileDoWhile;

import java.util.Scanner;

public class Login1 {
    public static void main(String[] args) {

        String Pass = "";
        String userName;

        int attempt = 3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your username");
        String u = scan.next();

        System.out.println("Please enter your Password");
        String p = scan.next();

        if (u.equals("helloworld") && p.equals("k12453."))
        {
            System.out.println("Please login");
        }else{

            while (!(u.equals("helloworld") && p.equals("k12453.") && attempt > 0)) {
                int attempts = 3;
                if(attempts==1){
                    System.out.println("You have the last chance ");
                }



                System.out.println("ınvalid username or password ,please re-enter");
                u = scan.next();

                System.out.println("Invalid passsword,Please re-enter");
                p = scan.next();
                attempts-=1;

                if (u.equals("helloworld") && p.equals("k12453.")) {
                    System.out.println("Please login");
                } else {
                    System.out.println("Your account has blocked");
                }

            }

        }
    }
}
