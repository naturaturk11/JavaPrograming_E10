package day6_PrimitiveLifeCasting;

public class ArithmeticOperation {
    public static void main(String[] args) {

        System.out.println(100/3);
        System.out.println(100d/3);// if added "d" beside number which results as double
        /** integer/integer=integer
            decimel/integer=decimel
            integer/decimel= decimel
            decimel/decimel= decimel
         */
        System.out.println(20/4);
        System.out.println(4.5/2);

        double a= 100;
        double b= (double) a/4;
        double c=  a/4d;
        System.out.println(c);

    }

    /** important explanation about the division: if the numbers are not integer
     not resulted with desimel-double,only could be int ; or should be used at least one double character
     example: in java 10/4= 2(not 2,5)but if 10.0/4 =2.5

     */





}
