package day37_Inheritance.PhoneTask;

public class Phone {//ONLY CONTAİNS COMMON FEATURES OFF ALL THE CLASS

    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;
    public static boolean hasBattery;

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    static {
        hasBattery=true;
    }

    public void call(long phoneNumber){
        System.out.println(brand+" "+ model+"is calling");
    }
   public  void text(long phoneNumber){
       System.out.println(brand+" "+ model+"is texting");
   }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=$" + price +
                ", color='" + color + '\'' +
                ", batery='" + hasBattery + '\'' +
                '}';
    }
}
/*
1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color
                Add Constructor to set all the fields
				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */