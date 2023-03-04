package day12_scanner;

import java.util.Scanner;

public class ShippingAdress {


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println( "Enter Your Full Name:");
        String fullName=input.nextLine();

        System.out.println("Enter your building number:");
        String buildingNumber=input.next();


        input.nextLine();
        System.out.println("Enter YOUR street name:");
        String streetName= input.nextLine();

        System.out.println(" enter your city name:");
        String cityName= input.nextLine();

        System.out.println(" enter the state name:");
        String stateName= input.nextLine();

        System.out.println(" enter your zip code");
        String zipCode= input.next();
        input.nextLine();
        System.out.println(" enter your country name:");
        String countryName= input.nextLine();


        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("stateName = " + stateName);
        System.out.println("zipCode = " + zipCode);
        System.out.println("countryName = " + countryName);





     input.close();








    }
}
