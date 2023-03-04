package day15ForLoop;

import java.util.Scanner;

public class OmeOfMultipleNumbers {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i < 101; i++) {//i:1,2,3,4,5,6.....100
            sum += i;


        }  System.out.println(sum);


        System.out.println("..................................................");

        int total=0;
        Scanner scan=new Scanner(System.in);

        for (int i = 2; i < 5; i++) {
            System.out.println("Enter a number");
             int number=scan.nextInt();
            total+=i;

        }
        System.out.println(total);
          scan.close();









    }}
