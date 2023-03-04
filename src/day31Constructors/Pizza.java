package day31Constructors;

public class Pizza {

    public char size;
    public int numberOfPepperoniTopping;
    public int  numberOfCheeseTopping;


    public Pizza(char size, int numberOfPepperoniTopping, int numberOfCheeseTopping) {
        this.size = size;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public double calcCost(){
        double startingPrice=(size =='S')? 10:(size=='M')?12:14;

        double totalPrice=startingPrice+(numberOfCheeseTopping+numberOfPepperoniTopping)*2;

       return totalPrice;

   }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", totalPrice=$" + calcCost() +//to add a new variable toString is first to coppy the former line and past the next line changing with new variables(look 31.lesson 2.53-54 minutes)
                '}';
    }


}
/*Attributes:
    		size, numberofCheeseTopping, numberOfPepperoniTopping

    		Add a constructor that can set all the fields

		Actions:
			calcCost(): returns the totalCost of the pizza
			toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
* */