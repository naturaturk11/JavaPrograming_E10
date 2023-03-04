package day23_CustomMethod;
import java.util.Arrays;
public class anagram {
    public static void main(String[] args) {


        anagram("listen","silent");





    }
    //create a method that can check if two strings are anagram
    //    		ex:
    //    			anagram("silent", "listen")
    //
    //
    //			output:
    //				silent and listen are anagram

    public static void anagram(String a1,String a2){

        char[]ch=a1.toCharArray();
        char[]ch1=a2.toCharArray();


        Arrays.sort(ch);
        Arrays.sort(ch1);



        boolean anagram=Arrays.equals(ch,ch1);
        if(anagram){
            System.out.println("anagram");
        }else {
            System.out.println("not anagram");
        }






    }







}
