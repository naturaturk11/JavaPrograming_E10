package day5_Concatenation_Muhtar;

public class ShippingAdress {
    public static void main(String[] args) {
        String name = "James King";
        String buildingNumber= "1123B";
        String streetNmame= "Jones Branch Dr";
        String city= "McLean";
        String state= "VA";
        String zipCode= "22031A";
        String adress= name+ "\n"+ buildingNumber + " " + streetNmame+ "\n"+ city+", "+" "+ state+" "+ zipCode;

        //we can use all these variables by using ,(komma) instead of semi colon...check muhtar lesson


        System.out.println(adress);

       // System.out.println(name+ "\n"+ buildingNumber + " " + streetNmame+ "\n"+ city+", "+" "+ state+" "+ zipCode );
        //here could be written one small variable as adress instead of full text or string

    }




}
