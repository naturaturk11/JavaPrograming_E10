package day20_Array;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabets = new char[26];  //Z~A

        /*        i     ch
        alphabets[0] = 'Z'; //90
        alphabets[1] = 'Y'; //89
        alphabets[2] = 'X'; //88
            ...
        */
/*                 i   ch1
        alphabets[0]='Z';//ASCİ TABLE number of'Z' İS 90//number decresingwhile index increasing
        alphabets[1]='Y';//ASCİ TABLE number of'Z' İS 89
        alphabets[2]='X';//ASCİ TABLE number of'Z' İS 88
*/

//first solution
        char ch='Z';
        for(char i=0, j='Z';i< alphabets.length;i++,j--){//why j is decresing derives from the ccharacters' number in asci table is decressing
            alphabets[i]=j;                         /**!!!*/
        }


        System.out.println(Arrays.toString(alphabets));//printing whole array!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


// second  solution
       char ch1='Z';
        for (int i=0;i<alphabets.length;i++,ch1--){//why j is decresing derives from the ccharacters' number in asci table is
            alphabets[i]=ch1;
        }

        System.out.println(Arrays.toString(alphabets));//printing whole array!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!



        // System.out.println(alphabets); it is not used variable without using Array.toSTRİNG METHOD

        System.out.println(Arrays.toString(alphabets));//printing whole array!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.println(alphabets[0]);//printing the element of array!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!






    }
}
