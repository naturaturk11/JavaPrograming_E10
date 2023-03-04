package day22_MultiDimensionelArrays;

import java.util.Arrays;

public class Items {
    public static void main(String[] args) {

        /*String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
        */


        String[][] items = {{"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};


        System.out.println(items[0][0]+" "+items[0][1]+" "+items[0][2]+" "+items[0][3]+"\n"+
                           items[1][0]+" "+items[1][1]+" "+items[1][2]+" "+items[1][3]+"\n"+items[2][0]+" "+
                items[2][1]+" "+items[2][2]+" "+items[2][3]);

        for (String[] item : items) {
            for (String element : item) {
                System.out.print(element+"\t");
            }
            System.out.println();
        }

        System.out.println("...............................................................");
        String reverse="";
        for (int i = 0; i < items.length; i++) {
            for (int j = items[i].length - 1; j >= 0; j--) {
                System.out.print(items[i][j]+"\t");
            }
            System.out.println();

        }
        System.out.println(".....................................................");
        for (int i = items.length - 1; i >= 0; i--) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j]+"\t");
            }
            System.out.println();
        }

            }


        }


























