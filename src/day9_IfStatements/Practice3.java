package day9_IfStatements;

public class Practice3 {

    public static void main(String[] args) {

        int n1=45;
        int n2=55;

        boolean isN1Max=n1>n2;
        boolean isN2Max=n2>n1;
        boolean isEqual= n1==n2;
        if(isN1Max){
            System.out.println(n1+"is maximum number.");
        }else if(isN2Max){
            System.out.println(n2+" is maximum number.");
        }else{
            System.out.println("Equal");}





    }


}
