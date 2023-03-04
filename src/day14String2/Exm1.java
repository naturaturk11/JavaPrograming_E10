package day14String2;

public class Exm1 {
    public static void main(String[] args) {

        /**2. Write a program that asks user to enter a word. and replace all the x or X with character a
         Input:
         xcodeX
         Output:
         acodea*/

        String str="xcodeX";
        System.out.println(str);
        String str1=str.replace("x", "a").replace("X", "a");
        System.out.println(str1);





    }
}
