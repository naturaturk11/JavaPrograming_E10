package day23_CustomMethod;

public class Calculator {
    public static void main(String[] args) {
  calculator(20,10,'*');




    }
    //create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result

public static void calculator(int num1,int num2,char mathOperator ){
        int result=0;
        if(mathOperator=='+'){
            result=num1+num2;

        } else if (mathOperator=='-') {
            result=num1-num2;
        } else if (mathOperator=='*') {
            result=num1*num2;
        } else if (mathOperator=='/') {
            result=num1/num2;
        }
    System.out.println(result);
}



}
