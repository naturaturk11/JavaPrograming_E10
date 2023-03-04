package utilities;

public class MathUtility {


    // 1 return the sum of two integers
    public static int sumOfTwo(int num1, int num2) {
        return num1 + num2;

    }

    //2 return the sum of two decimal numbers
    public static double sumOfTwo(double num1, double num2) {
        return num1 + num2;


    }

    // return the subtraction of two integers
    public static int subtractionOfTwo(int num1, int num2) {
        return num1 - num2;

    }

    //return the subtraction of two decimals
    public static double subtractionOfTwo(double num1, double num2) {
        return num1 - num2;

    }

    //return the multiplication of two integers
    public static int multiplicationOfTwo(int num1, int num2) {
        return num1 * num2;

    }

    //return the multiplication of two decimals
    public static double multiplicationOfTwo(double num1, double num2) {
        return num1 * num2;

    }

    //passes two double parameters and return the division result
    public static double divisionOfTwo(double num1, double num2) {
        return num1 / num2;

    }

    //check if an integer is even number
    public static int evenNumbers(int num){
        if(num%2==0){
            System.out.println(num+" is even number");
        }else{
            System.out.println(num+" is odd number");
        }
        return num;
    }

    //check if an integer is odd number
    public static int oddNumbers(int num){
        if(num%2!=0){
            System.out.println(num+" is odd number");
        }else{
            System.out.println(num+" is even number");
        }
        return num;
    }

    //return the maximum number between two integers
    public static int maxNumber(int num1,int num2){
        int max=0;
        if(num1>num2){
            max=num1;
        } else if (num2>num1) {
            max=num2;
        }
        return max;
    }

    //return the maximum number between two decimal numbers
    public static double maxNumber(double num1,double num2){
        double max=0;
        if(num1>num2){
            max=num1;
        } else if (num2>num1) {
            max=num2;
        }
        return max;
    }

    //return the minimum number between two integers
    public static int minNumber(int num1,int num2){
        int min=0;
        if(num1<num2){
            min=num1;
        } else if (num2<num1) {
            min=num2;
        }
        return min;
    }

    //return the minimum number between two decimal numbers
    public static double minNumber(double num1,double num2){
        double min=0;
        if(num1<num2){
            min=num1;
        } else if (num2<num1) {
            min=num2;
        }
        return min;
    }

    //return the square of an integer
    public static int square(int num){
        int sq=0;
        return num*num;
    }

    //return the square of an double
    public static double square(double num){
        double sq=0;
        return num*num;
    }

    // return the cube of an integer
    public static int cube(int num){

        return num*num;
    }

    // return the cube of a double
    public static double cube(double num){

        return num*num;
    }










}
