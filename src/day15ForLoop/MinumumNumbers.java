package day15ForLoop;

import java.util.Scanner;

public class MinumumNumbers {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int min=2147483647;//any number entered less than 2147483647
        
        for(int i=10;i<=14;i++){
            System.out.println("Enter any number");
            int num=scan.nextInt();
            if(num<min){
                min=num;
            }
            
        }

        System.out.println("min = " + min);
        
        
        
        
        
        
        
        
        
        
    }
}
