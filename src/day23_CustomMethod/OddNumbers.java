package day23_CustomMethod;

public class OddNumbers {
    public static void main(String[] args) {

        odd();
        System.out.println();
        even();





    }
    //1. create a method that can print odd numbers between 1~100 in a same line saperated by space

    public static void odd(){

        for (int i = 1; i <= 100; i+=2) {

                System.out.print(i+" ");
        }

        }

       // create a method that can print even numbers between 1~100 in a same line saperated by space

        public static void even(){
            for (int i = 0; i <100 ; i+=2) {
                System.out.print(i+" ");
            }


        }





    }




