package day23_CustomMethod;

public class A {
    public static void main(String[] args) {
       evenNumbers(12);



    }
    public static void evenNumbers(int number){
        String result="";
        if(number%2==0){
            result="is even number";
        }else {
            result= "is not even number";
        }
        System.out.println("result = " + result);

    }






}
