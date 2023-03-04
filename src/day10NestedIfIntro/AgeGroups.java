package day10NestedIfIntro;

public class AgeGroups {
    public static void main(String[] args) {

int age=55;

if (age>=1 && age<=150){if(age<21){
    System.out.println(" Teenager");} else if (age>=21 && age<55) {
    System.out.println("Adult");}else {
    System.out.println(" Senior");

}


    }else{
        System.out.println("Invalid");}
    }



}
