package day12_scanner;

import java.util.Scanner;

public class StockMarket {


    public static void main(String[] args) {

        int number=20;
        Scanner input= new Scanner(System.in);
        System.out.println(" How  many total shares you have already");
        int totalShares= input.nextInt();
         String result="Invalid Number of shares";
        if(number>0){

        System.out.println(" How much your total value");
        double totalValue= input.nextDouble();


        input.nextLine();
        System.out.println(" What is the name of the company the most shares you have");
        String mostShares= input.nextLine();




       result= "Your total stock market holding is "+"$"+totalValue+" which is made up of " +
                totalShares +" shares."+ mostShares+ " is your company holdings";





        } System.out.println(result);


}}

