package day33_Statics;

public class Iphone {

   public static String brand="Apple";

   public String model;

   public double price;

   public static String operatingSystem="IOS";

   public String color;

   public static String size;

   public static String countryMadeIn="Chine";

   public static boolean isBattery=true;

   public static boolean isTouchScreen=true;

   public static boolean hasFaceTime=true;

   //public static void printModeAndPrice(){
    // System.out.println(model+":"+ preice);//static method in java not accept instances
 //  }
 public void method1(){
    System.out.println(model+": "+price);
    System.out.println(operatingSystem);
 }

  public static void setOperatingSystem(){
      System.out.println(operatingSystem);
  }





}
