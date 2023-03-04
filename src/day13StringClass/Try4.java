package day13StringClass;

import java.util.Scanner;

public class Try4 {


    public static void main(String[] args) {
        Scanner scan=new Scanner((System.in));
        System.out.println("Enter first name");
        String firstname=scan.next();
        System.out.println("Enter lastname");
        String lastname=scan.next();

        char f=firstname.toUpperCase().charAt(0);
        char l=lastname.toUpperCase().charAt(0);
        System.out.println(f+"."+l);










    }
}
