package day20_Array;

import java.util.Arrays;

public class ItemsPricesIds {
    public static void main(String[] args) {

        /**Given the following arrays:
         String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
         double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
         int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


         1. find out the first index number of "Gloves"

         2. find out if "iPad" is contained in the item list

         3. Print the report of each shopping item
         name - price - #ID   */

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        for (int i = 0; i < items.length; i++) {
            if(items[i].contains("Glove")){
                System.out.println("First number of Glove is: "+i);
                break;
            }

        }
        for (int i = 0; i < items.length; i++) {
            if(items[i].contains("ipad")){
                System.out.println("ipad is contained in the item list");
                break;
            }

        }

        for (int i = 0; i < items.length; i++) {
            System.out.println(Arrays.toString(items)+items[i]+" -"+prices+" -#"+ itemIDs[i]);

        }





         }
}
