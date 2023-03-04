package day8IfStatementsWithMuhtar;

public class SwapTwVariables_WithTemporaryVariable {


    public static void main(String[] args) {


int a=10;
int b= 15;
//.............................................
 int c= b;// c=15;
 b=a;//b=10
 a=c;

        System.out.println(a);
        System.out.println(b);


    }
}
