package day23_CustomMethod;

public class Calculate {
    public static void main(String[] args) {


        calculateOfAreaOfCircle(6);
        areaOfsquare(4);






    }
    //create a method that can calculate the area of a circle
    public static void calculateOfAreaOfCircle(int p){

        double r=3.14;
         double area=p*r*p;
        System.out.println(area);


    }
//create a method that can calculate the area of a square

    public static void areaOfsquare(int p){


        int area=p*p;
        System.out.println(area);


    }





}
