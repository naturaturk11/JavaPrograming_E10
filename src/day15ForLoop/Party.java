package day15ForLoop;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String gueslist="";




        while (true){
            System.out.println("enter your first guest name");
            String firstGuest=scan.next().toLowerCase();
            System.out.println(gueslist+":"+firstGuest);
            System.out.println("would you enter another guest name");
            String ans=scan.next();


            if(ans.equalsIgnoreCase("yes")){
                System.out.println("enter your guest name");
                String secondGuest=scan.next();
                System.out.println(gueslist+":"+firstGuest+secondGuest);
                System.out.println("would you enter another guest name");
                String ans1=scan.next();
            } else if (ans.equalsIgnoreCase("no")) {
                System.out.println();

            }


        }









    }
}
