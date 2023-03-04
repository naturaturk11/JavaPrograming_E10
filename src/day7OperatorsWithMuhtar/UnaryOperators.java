package day7OperatorsWithMuhtar;

public class UnaryOperators {
    public static void main(String[] args) {


int num1=25;
int num2=-8;

        System.out.println(num1>num2);
        System.out.println(num1<num2);
        System.out.println(".....................");




        int a=5;
        ++a;// pre increment : increases the value by 1 right away
        --a;// pre decrement: decreses increases the value by 1 right away
        System.out.println(a);

        System.out.println(".............................................");
        int b=100;
        System.out.println(++b); // pre increment : increases the value by 1 rirht away-immediately

        int c=100 ;
        System.out.println( c++);//post icrement: first passes the current value, then increases the value by 1
        System.out.println(c);//101

        System.out.println(".............................................");


        int x=200;
        System.out.println(--x);// pre decrement: decreases the value by righrt away
         int y= 200;
        System.out.println(y--);// post decrement: first passes the current value, then decreses the value by 1
            System.out.println(y);//199

            System.out.println(y--);

            int q=30;
            System.out.println(--q);
            System.out.println(q--);
            System.out.println(q);











    }





}
