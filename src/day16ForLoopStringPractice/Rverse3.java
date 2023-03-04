package day16ForLoopStringPractice;

public class Rverse3 {
    public static void main(String[] args) {

        String  word=" the person you have called cannot to reach the moment";
        String result="";

        for(int i=word.length()-1;i>=0;i--){
            result+=word.charAt(i);
        }
        System.out.println("result = " + result);

        System.out.println("...........................................................");

        String  str="Java";
        String result1="";

        for(int i=str.length()-1;i>=0;i--){
            result1+=str.charAt(i);
        }
        System.out.println("result1 = " + result1);






    }
}
