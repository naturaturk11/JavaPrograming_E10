package day12_scanner;

import java.util.Scanner;

public class Nextline {



/************important warning about the disadvatage of nextline method stressed in line19-23*/



public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println(" enter your fullname");// hasan sadebıyık Enter
       String fullName= input.nextLine();

        System.out.println(" enter your programming language:");
       String Programing =input.nextLine();

        System.out.println(" how old are you:");

        /**24....after other types used out of nextline enter go out of the line
        then it is neccessary to add one additional "input.nextLine();" once more after other used types*/

        int age =input.nextInt();/**=====> 41enter but enter here is ignored which effect
         the nextline method which is going to be used in the next line */

        input.nextLine();


        System.out.println(" school name:");
        String SchollName =input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("Programing = " + Programing);
        System.out.println("age = " + age);
        System.out.println("SchoolName = " + SchollName);

        input.close();


    }
}
