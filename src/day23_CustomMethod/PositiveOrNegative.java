package day23_CustomMethod;

public class PositiveOrNegative {
    public static void main(String[] args) {

        valueOfInteger(-5);



    }
    //create a method that can if the given integer is positive, negative or zero
    public static void valueOfInteger(int num){

        if(num>0){
            System.out.println("integer is:positive");
        } else if (num<0) {
            System.out.println("integer is:negative");
        }else {
            System.out.println("integer is:zero");
        }


    }



}
