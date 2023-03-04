package day11Switch_Scanner;

public class CappucinoBuyer {
    public static void main(String[] args) {

        String size = "grande";
        double price = 0.0;
        int caloris = 0;

        switch (size) {

            case "tall":
                price = 3.69;
                caloris = 90;
                break;
            case "grande":
                price = 3.99;
                caloris = 120;
                break;
            case "venti":
                price = 4.29;
                caloris = 150;
                break;
            default:

                System.out.println("invalid size");


        }
        if (price != 0) {
            System.out.println("price is:$ " + price);
            System.out.println("caloris = " + caloris);


        }

    }}
