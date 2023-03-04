package day37_Inheritance.PhoneTask;

public class Iphone extends Phone {

                   //!!!!!!!!
    public Iphone( String model, String size, double price, String color) {//String brand wsa deleted bcs of the brand is same
        super("Apple", model, size, price, color);
             //!!!!!!!!!!!!!!!!

    }

    public void faceTime(long phoneNumber,String email){
        System.out.println(brand+" "+model+"is providing facetİme servise with number: "+phoneNumber);
        System.out.println(brand+" "+model+"is sproviding email servise with the adresse of "+email);
    }

}
/*
 1.2 Create a subclass of Phone named IPhone:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    faceTime(long phoneNumber)
                    faceTime(String email)
                    toString()
 */