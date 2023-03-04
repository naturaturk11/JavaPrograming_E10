package day15ForLoop;

public class SumOfDigitsStringFrom {
    public static void main(String[] args) {

        /*Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...

        */


String str="A1B2C3";

int sum=0;


        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(ch<='9' && ch>='0'){
                sum+=ch;
            }
            
        }
        System.out.println(sum);






        String n="ahf45vff86gg9gh52bh8g6f";
        int sumOfDiigits=0;

        for (int i = 0; i <n.length() ; i++) {
            char ch=n.charAt(i);
            if(ch>='1' && ch<='9'){//care about the quote
                sumOfDiigits+=ch;
            }
        }System.out.println("sumOfDiigits = " + sumOfDiigits);



    }
}
