package day15ForLoop;

public class T2 {
    public static void main(String[] args) {


        String a="happy happy happy happy birthday";
        int result=0;


        for (int i = 0; i <a.lastIndexOf("b") ; i++) {

            String b=a.substring(i,i+5);
            if(b.equalsIgnoreCase("happy"))
            result++;


        }
        System.out.println(result);










        }}











