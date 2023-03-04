package day15ForLoop;

public class Reverse3 {
    public static void main(String[] args) {

        String b="Hasan Sadebıyık";
        String reverse="";

        for (int i = b.length()-1; i >=0 ; i--) {
            char ch=b.charAt(i);
            reverse+=ch;
        }
        System.out.println("reverse = " + reverse);





        /*

	7. Write a program that can reverse any given string

			Ex:
				input: 
					Wooden Spoon

				output:
					noopS nedooW
        */


        String a="Never mind";
        String result="";
        
        
        for (int i = a.length()-1; i >=0 ; i--) {

            result+=a.charAt(i);
        }
        System.out.println("result = " + result);
        
        
        
        
        
    }
}
