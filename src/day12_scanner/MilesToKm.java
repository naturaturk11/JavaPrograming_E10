package day12_scanner;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println(" enter miles");
        double miles= input.nextDouble();
        input.close();
        double kilometres=miles*1609/1000;
        System.out.println("10.0 miles equal to 16,09 kilometres" );


    }
}
