package day15ForLoop;

public class A1 {
    public static void main(String[] args) {

        /*write a program that can calculate the sum of all numbers between 1 to any given
        number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275 */

        int num=100;
        int result=0;
        for (int i = 1; i <=100 ; i++) {
          result+=i;

        }
        System.out.println(result);


    }
}
