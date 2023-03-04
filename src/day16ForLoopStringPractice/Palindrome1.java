package day16ForLoopStringPractice;

public class Palindrome1 {

    public static void main(String[] args) {
        String d1="ikİö";
        String result="";


        for(int i=d1.length()-1;i>=0;i--){
            result+=d1.charAt(i);
        }

        boolean isreversed=d1.equalsIgnoreCase(result);
        System.out.println("isreversed = " + isreversed);


    }
}
