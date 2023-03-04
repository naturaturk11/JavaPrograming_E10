package day18_nested_loop;

public class AustractsNestedLoopPractice {

    public static void main(String[] args) {
        /*Print the following shape by using a nested Loop:
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         */

       /* for (int j = 0; j < 10; j++) {
            for (int i = 0; i <10 ; i++) {
                System.out.print("* ");

        }

            System.out.println();


        }*/
        System.out.println("..................................................................");


        /*Use a nested loop to print the following shape
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         * * * * * * * *
         * * * * * * * * *
         * * * * * * * * * *               */


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int t = 1; t <=10 ; t++) {
            System.out.println(" *".repeat(t));
        }


        for (int i = 10; i >=1 ; i--) {
            System.out.println(" *".repeat(i));
        }


    }


}



