package day12_scanner;

import java.util.Scanner;

public class CustomerServices {


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the product name");
        String productName= scan.nextLine();
        scan.nextLine();

        System.out.println(" enter the price");
        double price= scan.nextDouble();

        System.out.println(" the  quantity");
        int quantity= scan.nextInt();

        System.out.println(" first name");
        String firstName= scan.next();
        scan.close();
        double total=quantity*price;
        System.out.println(firstName+" ,"+" your order for " + quantity  + productName + " has been places.Your total is " +"$"+ total+".");


    }
}
