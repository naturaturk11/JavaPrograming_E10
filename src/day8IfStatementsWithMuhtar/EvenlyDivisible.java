package day8IfStatementsWithMuhtar;

public class EvenlyDivisible {


    public static void main(String[] args) {

        /** 2. Create a class called EvenlyDivisible(should be 0 as remainder),and write a program that can check if a number is evenly divisible by 2, 3, 5
         Ex:
         number = 65;

         output:
         65 is divisible by 2: false
         65 is divisible by 3: false
         65 is divisible by 5: true*/

        int number=65;
        boolean divisibleBy2= number%2==0;// if the remainder of a number divided by 2 is zero ,then it is divisible by 2
        boolean divisebleBy3 =number%3==0;// if the remainder of a number divided by 3
        boolean divisibleBy5= number%5==0;// if the remainder of a number divided by 5

        System.out.println(number+" id divisible by 2:"+ divisibleBy2);
        System.out.println(number+" is divisible by 3 "+ divisebleBy3);
        System.out.println(number+" is divisible by 5 "+ divisibleBy5);

     // number%2==0......important mark == one of is assign the other is equelnmark


        System.out.println(".........................................................");

        int year= 200;
         boolean isLeapYear= year%4==0;
        System.out.println(year+" is leap year:"+isLeapYear);

















    }
}
