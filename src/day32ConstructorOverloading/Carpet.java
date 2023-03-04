package day32ConstructorOverloading;

public class Carpet {
    /*
1.Carpet Task:
		1.1 create a custom class for the Carpet class that should contain the following:
                Attributes:
                        width, length, unitPrice, isPersian (boolean)
				Add a constructor to set all the instances
                Actions:
                    calcCost(): should be able to calculate the total cost of the carpet and return it as double
                    toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
            total price of carpet = (width*length)*unitprice
            if the carpet is persian  carpet, add 200$ to the totalPrice
 */

    public double width,length,unitPrice;

    public boolean isPersion;

    public Carpet(double width, double length, double unitPrice, boolean isPersion) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersion = isPersion;
    }

    public double calcCost(){
       double totalPrice= (width*length)*unitPrice;
       if(isPersion){
           totalPrice+=200;
       }
       return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=$" + unitPrice +
                ", total Price=$" + calcCost() +
                ", isPersion=" + isPersion +
                '}';
    }
}
