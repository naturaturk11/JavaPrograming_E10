package day27_WrapperClasses;

public class Exe1 {
    public static void main(String[] args) {
        String a1="a1s2f5e9g6";
        int sum=0;

        for (char each:a1.toCharArray()){
           if(Character.isDigit(each)){
               sum+=Integer.parseInt(""+each);
           }

        } System.out.println("sum = " + sum);





    }





}
