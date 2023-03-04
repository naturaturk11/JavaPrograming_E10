package day17WhileDoWhile;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {


        for (char i = 'A' ; i <= 'Z' ; i++) {
            if(i=='F'){
                continue;//exist the loop
            }
            System.out.print(i+" ");






        }

        System.out.println();

        System.out.println("...........................................................");
        Scanner scan=new Scanner(System.in);


        while (true){

            System.out.println("Enter the number");
            int num=scan.nextInt();

            if(num<0){
                break;
            }

        }











    }
}
