package day26_CustomMethodPractices;

public class SumOfIntegers {
    public static void main(String[] args) {

        int sum = sumOfTwo(10, 20);
        System.out.println("sum = " + sum);

        System.out.println();

        double sum1=sumOfTwo(1.2,1.5);
        System.out.println("sum1 = " + sum1);

        int sub = subtractionOfTwo(10, 20);
        System.out.println("sub = " + sub);

        double sub1 = subtractionOfTwo(1.2,1.5);
        System.out.println("sub1 = " + sub1);

        double div=divisionOfTwo(5.2,1.6);
        System.out.println("div = " + div);

        int num1=evenNumbers(-2);
        int num2=oddNumbers(3);
        int maxNum= maxNumber(9,8);
        System.out.println("maxNum = " + maxNum);

        double maxNum1=maxNumber(1.2,6.8);
        System.out.println("maxNum1 = " + maxNum1);

        int min=minNumber(8,6);
        System.out.println("min = " + min);

        double min1=minNumber(8.1,6.9);
        System.out.println("min1 = " + min1);

       double sq1=square(1.8);
        System.out.println("sq1 = " + sq1);
        
      int cb = cube(4);
        System.out.println("cb = " + cb);
        double cb1=cube(1.6);
        System.out.println("cb1 = " + cb1);
    }

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