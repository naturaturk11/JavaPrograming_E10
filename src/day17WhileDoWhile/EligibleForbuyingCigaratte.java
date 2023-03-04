package day17WhileDoWhile;

import java.util.Scanner;

public class EligibleForbuyingCigaratte {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scan.nextInt();

        if((age > 18 && age<65)) {
            System.out.println("Plaese give me your order");
            String order=scan.next();}

            else if(!(age > 18 && age<65)){
            System.out.println("Please tell me what time is it");
            int time = scan.nextInt();



              if ((time >= 8) && (time <= 19)) {
            System.out.println("Plaese give me your order");
        } else {
            System.out.println("You are not available to buy any cigar");

        }
    }}}