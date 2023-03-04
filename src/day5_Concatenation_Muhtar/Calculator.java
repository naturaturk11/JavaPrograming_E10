package day5_Concatenation_Muhtar;

public class Calculator {

    public static void main(String[] args) {

        int firstNumber= 100;
        int secondNumber= 50;
        int addition= firstNumber+secondNumber;
        int substraction = firstNumber-secondNumber;
         int multiplication= firstNumber*secondNumber;
        //100+50=150
                //100-50=50
                //100*50=5000
        System.out.println(firstNumber +"+" + secondNumber + "=" + (firstNumber+secondNumber));
        System.out.println(firstNumber +"+" + secondNumber + "=" + addition);
        System.out.println(firstNumber + "- " +secondNumber + " = "+ (firstNumber-secondNumber));
        System.out.println(firstNumber + "- " +secondNumber + " = "+ substraction);
        System.out.println(firstNumber + "* " +secondNumber + " = "+multiplication);



    }
}
