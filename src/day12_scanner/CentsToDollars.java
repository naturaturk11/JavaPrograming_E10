package day12_scanner;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter cents ");
        int cents= scan.nextInt();
        scan.close();

        int dollar= cents/100;
        cents-=dollar*100;
        System.out.println(dollar+" dollars and" +cents+" cents");






    }



}
